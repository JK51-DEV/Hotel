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
        String sql = "insert into factura values ('f.Codigoautomatico()','" + f.getCliente().getDni() + "',"
                + "'" + f.getAloj().getCodAloj() + "','" + f.getComp().getNum() + "','" + f.Hoy() + "')";
        return Acceso.ejecutar(sql);
    }
    
//    public static List<Factura> generar_factura(String dni, String res, String compra) {
//    List<Factura> lis = new ArrayList<>();
//
//    Factura fac = new Factura();
//    Cliente cli = DaoCliente.buscar(dni);
//    Reserva reser = DaoReserva.buscarReservaLista(res);
//    Compra comp = DaoCompra.buscarcompra(compra);
//    
//    double totalFactura = 0.0;
//    if (reser != null) {
//        totalFactura += reser.Importe();
//    }
//    
//    String totalCompraStr = buscarMontoCompra(comp.getNum());
//        if (totalCompraStr != null) {
//            double totalCompra = Double.parseDouble(totalCompraStr);
//            totalFactura += totalCompra;
//        }
//    
//        fac.setCliente(cli);
//        fac.setRes(reser);
//        fac.setComp(comp);
//        fac.setTot(totalFactura);
//
//        lis.add(fac);
//
//    return lis;
//}
    
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