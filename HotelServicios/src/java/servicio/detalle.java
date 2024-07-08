
package servicio;

import java.util.List;

/**
 *
 * @author Lume
 */
public class detalle {

    private String num, cod;
    private int can;

    public detalle() {
    }

    public detalle(String num, String cod, int can) {
        this.num = num;
        this.cod = cod;
        this.can = can;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }
 
}
