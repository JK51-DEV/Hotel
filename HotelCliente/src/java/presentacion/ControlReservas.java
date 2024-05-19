/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import servicio.ServReserva_Service;
import servicio.ServReserva;


@WebServlet(name = "ControlReservas", urlPatterns = {"/ControlReservas"})
public class ControlReservas extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    String res = "No se registró";

    try {
        // Obtener los parámetros del formulario
        //String codRes = request.getParameter("rese");
        String hab = request.getParameter("hab");
        String cat = request.getParameter("cat");
        String fecInicio = request.getParameter("fini");
        String fecFin = request.getParameter("ffin");

        // Crear el cliente del servicio web
        ServReserva_Service service = new ServReserva_Service();
        ServReserva port = service.getServReservaPort();

        // Llamar al método registrarReserva del servicio web
        //String resultado = port.registrarReserva(codRes, hab, cat, fecInicio, fecFin);
        String resultado = port.registrarReserva(hab, cat, fecInicio, fecFin);
        // Verificar si la reserva se realizó correctamente
        if (resultado.startsWith("Se guardó")) {
            res = "Reserva realizada correctamente: " + resultado;
        } else {
            res = "Error al realizar la reserva: " + resultado;
        }
    } catch (Exception e) {
        // Capturar cualquier excepción y manejarla adecuadamente
        res = "Error: " + e.getMessage();
        out.println("Error: Ingrese datos correctos");
    } finally {
        // Enviar la respuesta al cliente
        out.println(res);
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
