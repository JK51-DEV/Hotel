package presentacion;
import java.util.*;

public class Presentador {
    private String tot="";
    private Object[]fil={"","","","",""};
    private List lis=new ArrayList();
    private Object[]fil2={"","",""};
    private String msg="";
    
    public Presentador() {
        lis.add(fil);
    }

    public String getTot() {
        return tot;
    }

    public void setTot(String tot) {
        this.tot = tot;
    }

    public Object[] getFil() {
        return fil;
    }

    public void setFil(Object[] fil) {
        this.fil = fil;
    }

    public List getLis() {
        return lis;
    }

    public void setLis(List lis) {
        this.lis = lis;
    }

    public Object[] getFil2() {
        return fil2;
    }

    public void setFil2(Object[] fil2) {
        this.fil2 = fil2;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
}
