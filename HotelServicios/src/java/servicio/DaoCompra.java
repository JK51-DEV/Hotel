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
    
    public List<Compra> BuscarComprapordni(String dni) {
        
        String sql="select * from Compra where dni='"+dni+"' AND CAST(SUBSTR(fec, 7, 4) || '-' || SUBSTR(fec, 4, 2) || '-' || SUBSTR(fec, 1, 2) AS DATE) = CURRENT_DATE";
        List tabla = Acceso.listar(sql);
        List lis = new ArrayList();
        for (int i = 0; i < tabla.size(); i++) {
            Object[] f = (Object[]) tabla.get(i);
            Compra aloj = new Compra();
            
            aloj.setNum(f[0].toString());
            aloj.setFec(f[1].toString());
            aloj.setTot(f[2].toString());
            aloj.setDni(f[3].toString());
            lis.add(aloj);
        }
    return lis;
    }
    
    
    
}
