package servicio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private String num,fec,tot,dni;

    private List cesta=new ArrayList();

    public Compra() {
    }
    
    public Compra(String num, String fec, String tot) {
        this.num = num;
        this.fec = fec;
        this.tot = tot;
    }
    
    public List agregarLinea(String cod,String nom,double pre,int can){
        Object[]linea=new Object[5];
        linea[0]=cod;
        linea[1]=nom;
        linea[2]=pre;
        linea[3]=can;
        linea[4]=pre*can;
        cesta.add(linea);
        return cesta;
    }
    public List quitarLinea(String cod){
        for(int i=0;i<cesta.size();i++){
            Object[]lin=(Object[])cesta.get(i);
            if(lin[0].equals(cod)){
                cesta.remove(i);
            }
        }
        return cesta;
    }
    public double getTotal(){
        double total=0;
        for(int i=0;i<cesta.size();i++){
            Object[]lin=(Object[])cesta.get(i);
            total+=Double.parseDouble(lin[4].toString());
        }
        return total;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public List getCesta() {
        return cesta;
    }    

    public String getTot() {
        return tot;
    }

    public void setTot(String tot) {
        this.tot = tot;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    

    
    
}
