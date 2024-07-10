/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Lume
 */
@WebService(serviceName = "ServicioFactura")
public class ServicioFactura {
    
    Factura fac= new Factura();
    ResuFactura resfac= new ResuFactura();
    DaoFactura daofac=new DaoFactura();

    @WebMethod(operationName = "buscarMontoCompra")
    public String buscarMontoCompra(@WebParam(name = "num") String num) {
        String res;
        String nom=DaoFactura.buscarMontoCompra(num);
        if (nom != null) {
            return nom;
        }else{
            res="No EXISTE COMPRA";
        }
    return res;
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "codigoautomatic")
    public String codigoautomatic() {
        return String.valueOf(fac.Codigoautomatico());
    }

    /**
     * Web service operation
     */
    //busca por codigo de factura
    @WebMethod(operationName = "listar_factura")
    public List<Factura> listar_factura(@WebParam(name = "codfac") String codfac) {
        DaoFactura fact = new DaoFactura();
        return fact.listar_factura(codfac);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "listarfacturas")
    public List<Factura> listarfacturas() {
        return DaoFactura.listarFacturas();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar_factura")
    public String agregar_factura(@WebParam(name = "cli") String cli, @WebParam(name = "codaloj") String codaloj, @WebParam(name = "comp") String comp) {
        Cliente clie = DaoCliente.buscar(cli);
        Alojamiento aloj= DaoAlojamiento.buscarAlojamientoLista(codaloj);
        Compra compra = DaoCompra.buscarcompra(comp);
        
        if (aloj == null) {
            return "No se encontró reserva con el código: " + aloj;
        }
        if (clie == null) {
            return "No se encontró el cliente con el DNI: " + clie;
        }
        if (comp == null) {
            return "No se encontró la compra con el código: " + compra;
        }
       // Crear objeto Factura
        Factura factura = new Factura();
        factura.setCliente(clie);
        factura.setAloj(aloj);
        factura.setComp(compra);

        // Guardar factura
        String msg = DaoFactura.grabarFactura(factura);
        if (msg == null) {
            msg = "Se guardó la factura";
        } else {
            msg = "No se guardó la factura";
        }
        return msg;
        
    }
    
    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "resumenFactura")
    public List resumenFactura() {
        //TODO write your implementation code here:
        return resfac.getResumenFactura();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar_resumen_factura")
    public String agregar_resumen_factura(@WebParam(name = "cli") String cli, @WebParam(name = "codaloj") String codaloj, @WebParam(name = "comp") String comp) {
        Cliente clie = DaoCliente.buscar(cli);
        Alojamiento aloj= DaoAlojamiento.buscarAlojamientoLista(codaloj);
        Compra compra = DaoCompra.buscarcompra(comp);
        
        if (aloj == null) {
            return "No se encontró alojamiento con el código: " + aloj;
        }
        if (clie == null) {
            return "No se encontró el cliente con el DNI: " + clie;
        }
        if (comp == null) {
            return "No se encontró la compra con el código: " + compra;
        }
        
        resfac.agregar(clie, aloj, compra);
        
        return "La factura se agregó";
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "registrar_Factura")
    public String registrar_Factura() {
         try {
           List<Factura> fac = resfac.getResumenFactura();
           String fact = DaoFactura.RegistrarFactura(fac);

            if (fact == null) {
                return "SE guardo la reserva:\n";
            } else {
                return "Errores al guardar la reserva:\n" + fact;
            }
       } catch (Exception e) {
           Throwable cause = e.getCause();
           while (cause != null) {
               e = (Exception) cause;
               cause = e.getCause();
           }
           return "Error al registrar todas las reservas: " + e.getMessage();
       }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "guardarfactura")
    public String guardarfactura(@WebParam(name = "cli") String cli, @WebParam(name = "codaloj") String codaloj, @WebParam(name = "comp") String comp) {
        Cliente clie = DaoCliente.buscar(cli);
        Alojamiento aloj= DaoAlojamiento.buscarAlojamientoLista(codaloj);
        Compra compra = DaoCompra.buscarcompra(comp);
        
        Factura f=new Factura(clie,aloj,compra);
        String msg= DaoFactura.grabarFactura(f);
        if (msg==null) {
            msg="Se guardo habitacion";
        }else{
            msg="NO se guardo habitacion";
        }
        return msg;
            
    }
    
    
    

}
