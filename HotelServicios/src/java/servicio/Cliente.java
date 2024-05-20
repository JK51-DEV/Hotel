package servicio;

public class Cliente {
    private int dni;
    private String  nom;

    public Cliente() {
    }

    public Cliente(int dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    
    
}
