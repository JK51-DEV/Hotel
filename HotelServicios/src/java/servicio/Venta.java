
package servicio;

public class Venta {
    private String num,fec,hor;
    private String dni,cod;
    private double tot;

    public Venta(String num, String fec, String hor,String dni, String cod, double tot) {
        this.num = num;
        this.fec = fec;
        this.hor=hor;
        this.dni = dni;
        this.cod = cod;
        this.tot = tot;
    }

    public Venta() {
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getTot() {
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
    }

    public String getHor() {
        return hor;
    }

    public void setHor(String hor) {
        this.hor = hor;
    }
    
}
