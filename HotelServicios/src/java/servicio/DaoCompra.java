/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import static servicio.Acceso.getConexion;

/**
 *
 * @author Lume
 */
public class DaoCompra {
    
    
    Connection d = getConexion();

    public static Compra buscarcompra(String cod_compra) {
        String sql = "select * from compra WHERE num='" + cod_compra + "'";
        Object[] f = Acceso.buscar(sql);
        if (f != null) {
        Compra r = new Compra();
        r.setNum(f[0].toString());      
        r.setFec(f[1].toString()); 
        r.setTot(f[2].toString());

        return r;
    }
    return null;
    }
    
    
    
}
