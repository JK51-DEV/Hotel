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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.Reserva;
import servicio.ServReserva;
import servicio.ServReserva_Service;

/**
 *
 * @author Usuario
 */
public class dis_buscar_reserva extends HttpServlet {

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
            ServReserva_Service server = new ServReserva_Service();
            ServReserva port = server.getServReservaPort();
            List<Reserva> dis = port.listarAvanzadoReserva(dni_cliente);
            //String res = "";
            for (Reserva d : dis) {
                out.print("<tr>");
                out.print("<td>" + d.getCodRes() +"</td>");
                out.print("<td>" + d.getCli().getDni() +"</td>");
                out.print("<td>" + d.getCli().getNom() +"</td>");
                out.print("<td>" + d.getFecCreacion() +"</td>");
                out.print("<td>" + d.getFecInicio() +"</td>");
                out.print("<td>" + d.getFecFin() +"</td>");
                out.print("<td>" + d.getImp() +"</td>");
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

}
