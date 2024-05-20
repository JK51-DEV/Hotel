package servicio;

public class Cliente {
    private String dni, nom;

    public Cliente() {
    }

    public Cliente(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }

    public Cliente(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
