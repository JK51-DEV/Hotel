package servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServVenta")
public class ServVenta {
    private Venta ven;
    
    @WebMethod(operationName = "nuevaVenta")
    public Venta nuevaVenta() {
        ven=new Venta();
        ven.setNum(DaoVenta.getNumGenerado());
        ven.setFec(Fecha.getFec());
        ven.setHor(Fecha.getHor());
        return ven;
    }

    @WebMethod(operationName = "grabarCompra")
    public String grabarCompra(@WebParam(name = "num") String num,
                               @WebParam(name = "fec") String fec,
                               @WebParam(name = "tot") double tot,
                               @WebParam(name = "dni") String dni) {
        String msg = null;
        Connection cn = null;
        try {
            cn = Acceso.getConexion();
            if (cn != null) {
                String sql = "INSERT INTO compra (num, fec, tot, dni) VALUES (?, ?, ?, ?)";
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.setString(1, num);
                ps.setString(2, fec);
                ps.setDouble(3, tot);
                ps.setString(4, dni);
                int filasInsertadas = ps.executeUpdate();
                if (filasInsertadas > 0) {
                    msg = "OK";
                } else {
                    msg = "Error al insertar la venta en la base de datos";
                }
                cn.close();
            } else {
                msg = "No hay conexión con la Base de Datos";
            }
        } catch (SQLException e) {
            msg = "Error SQL: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException ex) {
                msg = "Error al cerrar la conexión: " + ex.getMessage();
            }
        }
        return msg;
    }
    
    @WebMethod(operationName = "grabarDetalleCompra")
    public String grabarDetalleCompra(@WebParam(name = "num") String num,
                                      @WebParam(name = "detalle") List<Linea> detalle) {
        String msg = null;
        Connection cn = null;
        try {
            cn = Acceso.getConexion();
            if (cn != null) {
                String sql = "INSERT INTO detalle (num, cod, can) VALUES (?, ?, ?)";
                PreparedStatement ps = cn.prepareStatement(sql);
                for (Linea linea : detalle) {
                    ps.setString(1, num);
                    ps.setString(2, linea.getCod());
                    ps.setInt(3, linea.getCan());
                    ps.addBatch();
                }
                int[] filasInsertadas = ps.executeBatch();

                boolean insertado = true;
                for (int resultado : filasInsertadas) {
                    if (resultado != 1) {
                        insertado = false;
                        break;
                    }
                }

                if (insertado) {
                    msg = "OK";
                } else {
                    msg = "Error al insertar el detalle de la compra en la base de datos";
                }
                cn.close();
            } else {
                msg = "No hay conexión con la Base de Datos";
            }
        } catch (SQLException e) {
            msg = "Error SQL: " + e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException ex) {
                msg = "Error al cerrar la conexión: " + ex.getMessage();
            }
        }
        return msg;
    }

}