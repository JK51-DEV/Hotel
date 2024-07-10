package servicio;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServCompra")
public class ServCompra {
    private Compra comp;
    
    @WebMethod(operationName = "nuevaCompra")
    public Object[] nuevaCompra() {
        comp=new Compra();
        comp.setNum(Acceso.getNum("select * from compra"));
        comp.setFec(Fecha.getFec());
        Object[]fil=new Object[3];
        fil[0]=comp.getNum();
        fil[1]=comp.getFec();
        fil[2]=comp.getTotal();        
        return fil;
    }

    @WebMethod(operationName = "agregarArticulo")
    public List<Object[]> agregarArticulo(@WebParam(name = "cod") String cod, @WebParam(name = "nom") String nom, @WebParam(name = "pre") String pre, @WebParam(name = "can") String can) {
        return comp.agregarLinea(cod, nom, Double.parseDouble(pre), Integer.parseInt(can));
    }

    @WebMethod(operationName = "quitarArticulo")
    public List<Object[]> quitarArticulo(@WebParam(name = "cod") String cod) {
        return comp.quitarLinea(cod);
    }

    @WebMethod(operationName = "verTotal")
    public String verTotal() {
        return String.valueOf(comp.getTotal());
    }

    @WebMethod(operationName = "grabarCompra")
    public String grabarCompra() {
        String sql="insert into compra values('"+comp.getNum()+"','"+comp.getFec()+"',"+comp.getTotal()+")";
        String msg=Acceso.ejecutar(sql);
        for(int i=0;i<comp.getCesta().size();i++){
            Object[]fil=(Object[])comp.getCesta().get(i);
            String sql2="insert into detalle values('"+comp.getNum()+"','"+fil[0]+"',"+fil[3]+")";
            msg=Acceso.ejecutar(sql2);
        }
        if(msg==null){
            msg="Compra Registrada";
        }
        return msg;
    }
    
    
    @WebMethod(operationName = "buscarCompra")
    public Compra buscarCompra(@WebParam(name = "num") String num) {
        String res;
        Compra nom=DaoCompra.buscarcompra(num);
        if (nom != null) {
            return nom;
        }
    return null;
    }

    
  
}
