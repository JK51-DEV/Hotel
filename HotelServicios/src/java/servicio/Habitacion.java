package servicio;

public class Habitacion {
    private String cod, nom, estado;
    private double pre;

    public Habitacion() {
    }

    public Habitacion(String cod, String nom, double pre) {
        this.cod = cod;
        this.nom = nom;
        this.pre = pre;
    }

    public Habitacion(String cod, String nom, String estado, double pre) {
        this.cod = cod;
        this.nom = nom;
        this.estado = estado;
        this.pre = pre;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }
    
}
