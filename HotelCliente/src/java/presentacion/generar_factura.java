/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import servicio.Factura;
import servicio.ServFactura;
import servicio.ServFactura_Service;
import servicio.ServReserva;
import servicio.ServReserva_Service;

/**
 *
 * @author Lume
 */
@WebServlet(name = "generar_factura", urlPatterns = {"/generar_factura"})
public class generar_factura extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/HotelServicios/ServFactura.wsdl")
    private ServFactura_Service service;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String dni = request.getParameter("dniCliente");
        String reser = request.getParameter("codigoReserva");
        String compra = request.getParameter("numeroCompra");

        // Llamar al método del servicio web para generar la factura
        List<Factura> facturas = generarfactura(dni, reser, compra);

        if (!facturas.isEmpty()) {
            // Guardar las facturas en el atributo de solicitud para ser utilizadas en el JSP
            request.setAttribute("facturas", facturas);

            // Enviar los datos al JSP para mostrarlos
            request.getRequestDispatcher("/Factura.jsp").forward(request, response);
        } else {
            // Redireccionar a la página de generación de factura si no se encontraron facturas
            response.sendRedirect("GenerarFactura.jsp");
        }
    
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Generacion de factura";
    }// </editor-fold>

    private List<Factura> generarfactura(String dni, String reser, String compra) {
        ServFactura port = service.getServFacturaPort();
        return port.generarfactura(dni, reser, compra);
    }

}
