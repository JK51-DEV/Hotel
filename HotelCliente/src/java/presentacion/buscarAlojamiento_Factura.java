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
import servicio.Alojamiento;
import servicio.ServAlojamiento_Service;

/**
 *
 * @author Lume
 */
@WebServlet(name = "buscarAlojamiento_Factura", urlPatterns = {"/buscarAlojamiento_Factura"})
public class buscarAlojamiento_Factura extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/HotelServicios/ServAlojamiento.wsdl")
    private ServAlojamiento_Service service;

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
            String dni_cliente = request.getParameter("dni_cliente");
            servicio.ServAlojamiento_Service service = new servicio.ServAlojamiento_Service();
            servicio.ServAlojamiento port = service.getServAlojamientoPort();
            List<Alojamiento> dis= port.buscarpordni(dni_cliente);
            //String res = "";
            for (Alojamiento d : dis) {
                out.print("<tr>");
                out.print("<td>" + d.getCodAloj() +"</td>");
                out.print("<td>" + d.getFecCreacionAloj()+"</td>");
                out.print("<td>" + d.getReserva().getCodRes()+"</td>");
                out.print("<td>" + d.getReserva().getCli().getDni()+"</td>");
                out.print("<td>" + d.getReserva().getCli().getNom()+"</td>");
//                out.print("<td>" + d.getReserva().getHab().getCod()+"</td>");
                out.print("<td>" + d.getReserva().getHab().getNom()+"</td>");
                out.print("<td>" + d.getReserva().getHab().getPre()+"</td>");
//                out.print("<td>" + d.getReserva().getFecCreacion()+"</td>");
                out.print("<td>" + d.getReserva().getFecInicio()+"</td>");
                out.print("<td>" + d.getReserva().getFecFin()+"</td>");
                out.print("<td>" + d.getReserva().getDia()+"</td>");
                out.print("<td>" + d.getReserva().getImp()+"</td>");
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

    private java.util.List<servicio.Alojamiento> buscarpordni(java.lang.String dni) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServAlojamiento port = service.getServAlojamientoPort();
        return port.buscarpordni(dni);
    }

}
