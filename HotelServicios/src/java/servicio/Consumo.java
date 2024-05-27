package servicio;

public class Consumo {
    private String cod, nom;
    private double pre;

    public Consumo() {
    }

    public Consumo(String cod, String nom, double pre) {
        this.cod = cod;
        this.nom = nom;
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

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }
}
