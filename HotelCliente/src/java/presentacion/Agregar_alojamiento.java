package presentacion;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.ServReserva;
import servicio.ServReserva_Service;

@WebServlet(name = "Agregar_alojamiento", urlPatterns = {"/Agregar_alojamiento"})
public class Agregar_alojamiento extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String res = "";

        try {
            // Obtener los parámetros del formulario
            String emp_dni = request.getParameter("emp_dni");
            String cod = request.getParameter("cod");

            // Crear el Alojamiento del servicio web
            servicio.ServAlojamiento_Service service = new servicio.ServAlojamiento_Service();
            servicio.ServAlojamiento port = service.getServAlojamientoPort();

            // Llamar al método agregarAlojamiento del servicio web
            String resultado = port.agregarAlojamiento(cod, emp_dni);
            if (resultado.startsWith("Se guardó")) {
                res = "Reserva realizada correctamente: " + resultado;
            } else {
                res = "Error al realizar la reserva: " + resultado;
            }
        } catch (Exception e) {
            res = "Error: " + e.getMessage();
            // Si hay un error, imprimir el mensaje de error en la respuesta
            out.println("Error: Ingrese datos correctos");
        } finally {
            // Finalmente, imprimir el resultado en la respuesta
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
