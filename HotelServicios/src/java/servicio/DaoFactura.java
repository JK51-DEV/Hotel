package servicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lume
 */
public class DaoFactura {
    
    public static String buscarMontoCompra(String num) {
        String sql = "select * from compra where num='" + num + "'";
        Object[] f = Acceso.buscar(sql);
        if (f != null) {
            return f[2].toString();
        }
        return null;
    }
    
    
    public static String grabarFactura(Factura f) {
        // Construir la consulta SQL para insertar la reserva en la base de datos
        String sql = "insert into factura values ('" + f.Codigoautomatico() + "','" + f.getCliente().getDni() + "',"
                + "'" + f.getAloj().getCodAloj() + "','" + f.getComp().getNum() + "','" + f.Hoy() + "')";
        return Acceso.ejecutar(sql);
    }
    
     public static String RegistrarFactura(List<Factura> factura) {
        StringBuilder errorMessages = new StringBuilder();
        for (Factura f : factura) {
            String result = grabarFactura(f);
            if (result != null) {
                errorMessages.append("Error al guardar el alojamiento ").append(f.getCodfac()).append(": ").append(result).append("\n");
            }
        }
        return errorMessages.length() > 0 ? errorMessages.toString() : null;
    }
    

    
    public static List<Factura> listarFacturas() {
        String sql = "select * from factura";
        List tabla = Acceso.listar(sql);
        List lis = new ArrayList();
        for (int i = 0; i < tabla.size(); i++) {
            Object[] f = (Object[]) tabla.get(i);
            Factura fac = new Factura();
            Cliente cli = DaoCliente.buscar(f[1].toString());
            //Reserva reser = DaoReserva.buscarReservaLista(f[2].toString());
            Alojamiento aloj= DaoAlojamiento.buscarAlojamientoLista(f[2].toString());
            Compra comp = DaoCompra.buscarcompra(f[3].toString());
            
            double totalFactura = 0.0;
            if (aloj != null) {
                totalFactura += aloj.getReserva().Importe();
            }

            String totalCompraStr = buscarMontoCompra(comp.getNum());
                if (totalCompraStr != null) {
                    double totalCompra = Double.parseDouble(totalCompraStr);
                    totalFactura += totalCompra;
                }
            
            fac.setCodfac(f[0].toString());
            fac.setCliente(cli);
            fac.setAloj(aloj);
            fac.setComp(comp); // Asignar la fecha de creación desde la entidad reserva
            fac.setFecfacturacion(f[4].toString());
            fac.setTot(totalFactura);
            lis.add(fac);
        }
        return lis;
    }
    
    
    public List<Factura> listar_factura(String codfac) {
        String sql = "select * from factura WHERE codfac='" + codfac + "'";
        List tabla = Acceso.listar(sql);
        List lis = new ArrayList();
        for (int i = 0; i < tabla.size(); i++) {
            Object[] f = (Object[]) tabla.get(i);
            Factura fac = new Factura();
            Cliente cli = DaoCliente.buscar(f[1].toString());
            //Reserva reser = DaoReserva.buscarReservaLista(f[2].toString());
            Alojamiento aloj = DaoAlojamiento.buscarAlojamientoLista(f[2].toString());
            Compra comp = DaoCompra.buscarcompra(f[3].toString());
            
            double totalFactura = 0.0;
            if (aloj != null) {
                totalFactura += aloj.getReserva().Importe();
            }

            String totalCompraStr = buscarMontoCompra(comp.getNum());
                if (totalCompraStr != null) {
                    double totalCompra = Double.parseDouble(totalCompraStr);
                    totalFactura += totalCompra;
                }
            
            fac.setCodfac(f[0].toString());
            fac.setCliente(cli);
            fac.setAloj(aloj);
            fac.setComp(comp); // Asignar la fecha de creación desde la entidad reserva
            fac.setFecfacturacion(f[4].toString());
            fac.setTot(totalFactura);
            lis.add(fac);
        }
        return lis;
    }

}