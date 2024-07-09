/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lume
 */
public class ResuFactura {
    private List<Factura> fact=new ArrayList();

    public List<Factura> getResumenFactura() {
        return fact;
    }

    public void getResumenFactura(List<Factura> alojamiento) {
        this.fact = fact;
    }

     public void agregar(Cliente cli, Alojamiento aloj, Compra comp) {

        if (cli != null) {
            Factura fac = new Factura(cli, aloj, comp);
            fact.add(fac);
        } else {
            throw new IllegalArgumentException("Ningún parámetro debe ser nulo");
        }
    }
    public void limpiar() {
        fact.clear();
    }
    
}

