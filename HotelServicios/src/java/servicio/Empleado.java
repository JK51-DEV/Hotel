/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

/**
 *
 * @author Usuario
 */
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
