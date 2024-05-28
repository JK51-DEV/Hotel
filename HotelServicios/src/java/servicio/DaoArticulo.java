package servicio;
import java.util.*;

public class DaoArticulo {
    public static List<Articulo>listar(){
        String sql="select * from consumo";
        List tabla=Acceso.listar(sql);
        List lis=new ArrayList();
        for(int i=0;i<tabla.size();i++){
            Object[]f=(Object[])tabla.get(i);
            Articulo art=new Articulo();
            art.setCod(f[0].toString());
            art.setNom(f[1].toString());
            art.setPre(Double.parseDouble(f[2].toString()));
            lis.add(art);
        }
        return lis;
    }
}
