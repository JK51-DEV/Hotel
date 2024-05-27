package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
/*import java.io.PrintWriter;*/
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import servicio.Servicios;
import servicio.ServiciosCliente;
import servicio.ServiciosEmpleado;
import servicio.ServiciosEmpleado_Service;

@WebServlet(name = "ControlEmpleado", urlPatterns = {"/ControlEmpleado"})
public class ControlEmpleado extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/HotelServicios/ServiciosEmpleado.wsdl")
    private ServiciosEmpleado_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/HotelServicios/Servicios.wsdl")
    private Servicios service;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String res = "Se registro";
        try {
            String dni = request.getParameter("dni");
            String nom = request.getParameter("nom");
            ServiciosEmpleado_Service server = new ServiciosEmpleado_Service();
            ServiciosEmpleado port = server.getServiciosEmpleadoPort();
            if (port.grabarEmpleado(dni, nom)) {
                res = "Registro Completo";
            }
            out.println(res);
        } catch (Exception e) {
            res = "Error: " + e;
            out.print("Ingresar datos correctos");
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

    private String buscarCliente(java.lang.String dni) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServiciosCliente port = service.getServiciosClientePort();
        return port.buscarCliente(dni);
    }

    private String buscarEmpleado(java.lang.String dni) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServiciosEmpleado port = service_1.getServiciosEmpleadoPort();
        return port.buscarEmpleado(dni);
    }

}
