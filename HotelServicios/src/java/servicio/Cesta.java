package servicio;
import java.util.*;

public class Cesta {
    private List ces=new ArrayList();
    private double tot;

    public List getCes() {
        return ces;
    }

    public void setCes(List ces) {
        this.ces = ces;
    }

    public double getTot() {
        double total=0;
        for(int i=0;i<ces.size();i++){
            Linea lin=(Linea)ces.get(i);
            total+=lin.getImp();
        }
        tot=total;
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }
    public void agregar(String cod,String nom,double pre,int can){
        Linea lin=new Linea(cod,nom,pre,can);
        ces.add(lin);
    }
    public void quitar(String cod){
        for(int i=0;i<ces.size();i++){
            Linea lin=(Linea)ces.get(i);
            if(lin.getCod().equals(cod)){
                ces.remove(i);
            }
        }
    }
}
