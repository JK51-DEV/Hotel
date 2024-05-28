package presentacion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import servicio.Articulo;
import servicio.Linea;
import servicio.ServCesta_Service;
import servicio.ServCliente_Service;
import servicio.ServListarArticulos_Service;
import servicio.ServVenta_Service;
import servicio.Servicios;
import servicio.Venta;

@WebServlet(name = "ControlConsumo", urlPatterns = {"/ControlConsumo"})
public class ControlConsumo extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/HotelServicios/Servicios.wsdl")
    private Servicios service_4;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SupermercadoServicios/ServCliente.wsdl")
    private ServCliente_Service service_3;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SupermercadoServicios/ServVenta.wsdl")
    private ServVenta_Service service_2;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SupermercadoServicios/ServCesta.wsdl")
    private ServCesta_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/SupermercadoServicios/ServListarArticulos.wsdl")
    private ServListarArticulos_Service service;
    private Presentador pres;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acc=request.getParameter("acc");
        if(acc.equals("Crear Cesta")){
            pres=new Presentador();
            crearCesta();
            pres.setTot(getTotal());
            request.getSession().setAttribute("pres", pres);
            response.sendRedirect("Cesta.jsp");
        }
        if(acc.equals("Listar Articulos")){
            List<Articulo>lista=listarArticulos();
            List lis=new ArrayList();
            for(int i=0;i<lista.size();i++){
                Articulo art=(Articulo)lista.get(i);
                Object[]fil=new Object[5];
                fil[0]=art.getCod();
                fil[1]=art.getNom();
                fil[2]=art.getPre();
                lis.add(fil);
            }
            pres.setLis(lis);
            response.sendRedirect("Catalogo.jsp");
        }
        if(acc.equals("Agregar Articulo")){
            String cod=request.getParameter("cod");
            String nom=request.getParameter("nom");
            String pre=request.getParameter("pre");
            String can=request.getParameter("can");
            agregarLinea(cod,nom,pre,can);
            List cesta=getCesta();
            List lis=new ArrayList();
            for(int i=0;i<cesta.size();i++){
                Linea lin=(Linea)cesta.get(i);
                Object[]fil=new Object[5];
                fil[0]=lin.getCod();
                fil[1]=lin.getNom();
                fil[2]=lin.getPre();
                fil[3]=lin.getCan();
                fil[4]=lin.getImp();
                lis.add(fil);
            }            
            pres.setLis(lis);
            pres.setTot(getTotal());
            response.sendRedirect("Cesta.jsp");
        }
        if(acc.equals("Quitar Articulo")){
            String cod=request.getParameter("cod");
            quitarLinea(cod);
            List cesta=getCesta();
            List lis=new ArrayList();
            for(int i=0;i<cesta.size();i++){
                Linea lin=(Linea)cesta.get(i);
                Object[]fil=new Object[5];
                fil[0]=lin.getCod();
                fil[1]=lin.getNom();
                fil[2]=lin.getPre();
                fil[3]=lin.getCan();
                fil[4]=lin.getImp();
                lis.add(fil);
            }            
            pres.setLis(lis);
            pres.setTot(getTotal());
            response.sendRedirect("Cesta.jsp");            
        }
        if(acc.equals("Nueva Venta")){
            Venta ven=nuevaVenta();
            Object[]fil=new Object[4];
            fil[0]=ven.getNum();
            fil[1]=ven.getFec();
            fil[2]=ven.getHor();
            List cesta=getCesta();
            List lis=new ArrayList();
            for(int i=0;i<cesta.size();i++){
                Linea lin=(Linea)cesta.get(i);
                Object[]fila=new Object[5];
                fila[0]=lin.getCod();
                fila[1]=lin.getNom();
                fila[2]=lin.getPre();
                fila[3]=lin.getCan();
                fila[4]=lin.getImp();   
                lis.add(fila);
            }
            pres.setLis(lis);
            pres.setTot(getTotal());
            pres.setFil(fil);
            response.sendRedirect("Venta.jsp");
        }
        if(acc.equals("Buscar Cliente")){
            String dni=request.getParameter("dni");
            java.util.List<java.lang.Object>lis=buscar(dni);
            if(lis.size()>0){
                Object[]fil2=new Object[2];
                fil2[0]=lis.get(0);
                fil2[1]=lis.get(1);
                pres.setMsg("");
                pres.setFil2(fil2);                
            }else{
                Object[]fil2=new Object[2];
                fil2[0]="";
                fil2[1]="";
                pres.setFil2(fil2);                 
                pres.setMsg("Cliente no encontrado");
            }
            response.sendRedirect("Venta.jsp");
        }
        if(acc.equals("")){
            
        }
        if(acc.equals("")){
            
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

    private java.util.List<servicio.Articulo> listarArticulos() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServListarArticulos port = service.getServListarArticulosPort();
        return port.listarArticulos();
    }

    private String agregarLinea(java.lang.String cod, java.lang.String nom, java.lang.String pre, java.lang.String can) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServCesta port = service_1.getServCestaPort();
        return port.agregarLinea(cod, nom, pre, can);
    }

    private String crearCesta() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServCesta port = service_1.getServCestaPort();
        return port.crearCesta();
    }

    private java.util.List<servicio.Linea> getCesta() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServCesta port = service_1.getServCestaPort();
        return port.getCesta();
    }

    private String getTotal() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServCesta port = service_1.getServCestaPort();
        return port.getTotal();
    }

    private String quitarLinea(java.lang.String cod) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServCesta port = service_1.getServCestaPort();
        return port.quitarLinea(cod);
    }

    private Venta nuevaVenta() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServVenta port = service_2.getServVentaPort();
        return port.nuevaVenta();
    }

    private java.util.List<java.lang.Object> buscar(java.lang.String dni) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        servicio.ServiciosCliente port = service_4.getServiciosClientePort();
        return port.buscar(dni);
    }
}
