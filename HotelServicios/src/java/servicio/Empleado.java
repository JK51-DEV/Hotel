
package servicio;

public class Empleado {
    private String dni, nom;

    public Empleado() {
    }

    public Empleado(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
    }

    public Empleado(String dni) {
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
