package servicio;

import java.util.ArrayList;
import java.util.List;

public class DaoHabitacion {
    // para buscar una habitacion disponible
    public static Habitacion buscarHabitacion(String cod){
        String sql="select * from habitacion where cod='"+cod+"' and estado ='D'";
        Object[]f=Acceso.buscar(sql);
        if(f!=null){
            Habitacion h=new Habitacion(f[0].toString(),f[1].toString(),f[2].toString(),Double.parseDouble(f[3].toString()));
            return h;
        }
        return null;
    }
    
    public static String grabarHabitacion(Habitacion h){
        //Habitacion p=new Habitacion();
        String sql="insert into habitacion values ('"+h.getCod()+"','"+h.getNom()+"','"+h.getEstado()+"',"+h.getPre()+")";
        return Acceso.ejecutar(sql);
    }
    
    public static List<Habitacion>listarHabitacion(){
        String sql="select * from habitacion where estado='D'";
        List tabla=Acceso.listar(sql);
        List lis=new ArrayList();
        for(int i=0;i<tabla.size();i++){
            Object[]f=(Object[])tabla.get(i); 
            Habitacion hab=new Habitacion();
            hab.setCod(f[0].toString());
            hab.setNom(f[1].toString());
            hab.setEstado(f[2].toString());
            hab.setPre(Double.parseDouble(f[3].toString()));
            lis.add(hab);
        }
        return lis;
    }
    // para buscar en general
    public static Habitacion buscarHabitacionCOD(String cod){
        String sql="select * from habitacion where cod='"+cod+"'";
        Object[]f=Acceso.buscar(sql);
        if(f!=null){
            Habitacion h=new Habitacion(f[0].toString(),f[1].toString(),Double.parseDouble(f[3].toString()));
            return h;
        }
        return null;
    }    
}

