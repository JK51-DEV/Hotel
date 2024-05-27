package servicio;

import java.util.*;

public class DaoConsumo {
    public static List<Consumo>listar(){
        String sql = "select * from consumo";
        List tabla = Acceso.listar(sql);
        List lis = new ArrayList();
        for (int i = 0; i < tabla.size(); i++) {
            Object[]f=(Object[])tabla.get(i);
            Consumo con = new Consumo();
            con.setCod(f[0].toString());
            con.setNom(f[1].toString());
            con.setPre(Double.parseDouble(f[2].toString()));
            lis.add(con);
        }
        return lis;
    }
}
