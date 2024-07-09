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
@WebServlet(name = "buscar_Factura", urlPatterns = {"/buscar_Factura"})
public class buscar_Factura extends HttpServlet {

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
       PrintWriter out = response.getWriter();
        try {
            String factura = request.getParameter("factura");
            servicio.ServicioFactura_Service service = new servicio.ServicioFactura_Service();
            servicio.ServicioFactura port = service.getServicioFacturaPort();
            List<Factura> fact = port.listarFactura(factura);
            //String res = "";
            for (Factura d : fact) {
                out.print("<tr>");
                out.print("<td>" + d.getCodfac() + "</td>");
                out.print("<td>" + d.getCliente().getDni() + "</td>");
                out.print("<td>" + d.getCliente().getNom() + "</td>");
                out.print("<td>" + d.getComp().getNum() + "</td>");
                out.print("<td>" + d.getAloj().getReserva().getHab().getNom() + "</td>");
                out.print("<td>" + d.getFecfacturacion() + "</td>");
                out.print("<td>" + d.getTot() + "</td>");
                out.print("</tr>");
                //out.print(res);
            }
        } catch (Exception e) {
            out.print("Error: " + e.getMessage());
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
