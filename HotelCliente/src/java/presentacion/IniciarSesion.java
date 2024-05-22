/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import servicio.Servicios;
import servicio.ServiciosEmpleado_Service;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "IniciarSesion", urlPatterns = {"/IniciarSesion"})
public class IniciarSesion extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/HotelServicios/ServiciosEmpleado.wsdl")
    private ServiciosEmpleado_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/HotelServicios/Servicios.wsdl")
    private Servicios service;

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
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            
            HttpSession sesion = request.getSession();
            
            
            
            String txtdni = request.getParameter("txtdni");
            String txtnom = request.getParameter("txtnom");
            
            boolean iniciarSesion = buscarUsuarioInicioSesion(txtdni, txtnom);
           boolean iniciarSesion2 = buscarAdministradorInicioSesion(txtdni, txtnom);
            if(iniciarSesion == true){ //EL usuario puede accesar por que esta registrado
                out.println("alert('¡Bienvenido a mi Página! \\nIniciaste sesion como: "+txtnom+"')");
                /*out.println("location = 'vistaReservas.jsp'");*/
                response.sendRedirect("validarCliente.jsp");
                
                String nombre = buscarNombre(txtdni);
                //System.out.println("El valor del nombre en el SERVLET es: " + nombre);
                
                sesion.setAttribute("nombre", nombre);
                sesion.setAttribute("txtdni", txtdni);
                
            } else if(iniciarSesion2 == true){//EL administrador puede accesar por que esta registrado
                out.println("alert('¡Bienvenido a la Página Administrador! \\nIniciaste sesion como: "+txtnom+"')");
                /*out.println("location = 'paginaInicio.jsp'");*/
                response.sendRedirect("validarEmpleado.jsp");
                
                String nombre = buscarNombreAdministrador(txtdni);
                //System.out.println("El valor del nombre en el SERVLET es: " + nombre);
               /* request.setAttribute("cliente", nombre);*/
                sesion.setAttribute("nombreAdmin", nombre);
                sesion.setAttribute("txtdniAdmin", txtdni);
                
                
            }else{
                out.println("alert('Datos Incorrectos, verifica tus credenciales o date de alta en el "
                        + "sistema')");
                out.println("location = 'Menu.jsp'");
            }
            System.out.println("El valor de inciasSesion dentro del SERVLET es: " + iniciarSesion);
            

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

    private boolean buscarUsuarioInicioSesion(java.lang.String dni, java.lang.String nom) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServiciosCliente port = service.getServiciosClientePort();
        return port.buscarUsuarioInicioSesion(dni, nom);
    }

    private String buscarNombre(java.lang.String dni) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServiciosCliente port = service.getServiciosClientePort();
        return port.buscarNombre(dni);
    }

    private boolean buscarAdministradorInicioSesion(java.lang.String dni, java.lang.String nom) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServiciosEmpleado port = service_1.getServiciosEmpleadoPort();
        return port.buscarAdministradorInicioSesion(dni, nom);
    }

    private String buscarNombreAdministrador(java.lang.String dni) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServiciosEmpleado port = service_1.getServiciosEmpleadoPort();
        return port.buscarNombreAdministrador(dni);
    }

}
