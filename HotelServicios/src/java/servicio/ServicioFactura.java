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

     @WebMethod(operationName = "generarfactura")
    public List<Factura> generarfactura(@WebParam(name = "dni") String dni, @WebParam(name = "reser") String res, @WebParam(name = "compra") String compra) {
        
        Reserva reserva = DaoReserva.buscarReservaLista(res);
        
        if (reserva != null && reserva.getCli() != null && reserva.getCli().getDni().equals(dni)) {
            List<Factura> facturas = DaoFactura.generar_factura(dni, res, compra);
            if (facturas != null) {
                return facturas;
            } else {
                return new ArrayList<>();
            }
        } else {
            return new ArrayList<>(); // o lanzar una excepción, según la lógica de tu aplicación
        }
    }

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
    public String agregar_factura(@WebParam(name = "cli") String cli, @WebParam(name = "res") String res, @WebParam(name = "comp") String comp) {
        Cliente clie = DaoCliente.buscar(cli);
        Reserva reser = DaoReserva.buscarReservaLista(res);
        Compra compra = DaoCompra.buscarcompra(comp);
        
        if (reser == null) {
            return "No se encontró reserva con el código: " + reser;
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
        factura.setRes(reser);
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

}
