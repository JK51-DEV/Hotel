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
import servicio.ServicioFactura_Service;

/**
 *
 * @author Lume
 */
@WebServlet(name = "generaFactura", urlPatterns = {"/generaFactura"})
public class generaFactura extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/HotelServicios/ServicioFactura.wsdl")
    private ServicioFactura_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        response.setContentType("text/html;charset=UTF-8");

        String codfac = request.getParameter("codfac");

        try {
            // Llamar al método del servicio web para obtener la factura
            List<Factura> facturas = listarFactura(codfac);

            if (!facturas.isEmpty()) {
                // Guardar las facturas en el atributo de solicitud para ser utilizadas en el JSP
                request.setAttribute("facturas", facturas);

                // Enviar los datos al JSP para mostrarlos
                request.getRequestDispatcher("/Factura.jsp").forward(request, response);
            } else {
                // Redireccionar a la página de error si no se encontraron facturas
                response.sendRedirect("error.jsp");
            }
        } catch (Exception e) {
            // Manejar excepciones adecuadamente
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private java.util.List<servicio.Factura> listarFactura(java.lang.String codfac) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServicioFactura port = service.getServicioFacturaPort();
        return port.listarFactura(codfac);
    }

    
    
}
