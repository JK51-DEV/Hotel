package servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
                               @WebParam(name = "tot") double tot) {
        String msg = null;
        Connection cn = null;
        try {
            cn = Acceso.getConexion();
            if (cn != null) {
                String sql = "INSERT INTO compra (num, fec, tot) VALUES (?, ?, ?)";
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.setString(1, num);
                ps.setString(2, fec);
                ps.setDouble(3, tot); // Usamos el tot recibido como parámetro
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
            msg = e.getMessage();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (SQLException ex) {
                msg = ex.getMessage();
            }
        }
        return msg;
    }

}
