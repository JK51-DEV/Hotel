/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import static servicio.Acceso.getConexion;

public class DaoEmpleado {
    Connection d = getConexion();
    
    public boolean grabar(String Dni, String Nom) {
    boolean estado = false;
    try {
        PreparedStatement ps = d.prepareStatement("INSERT INTO empleado (dni, nom) VALUES (?, ?)");
        ps.setString(1, Dni);
        ps.setString(2, Nom);
        
        int rs = ps.executeUpdate();
        
        if (rs >= 1) {
            estado = true;
        }
        
        ps.close();
        d.close(); // Cierre de la conexión aquí después de manejar la excepción
    } catch (SQLException e) {
        System.out.println("Error: " + e);
    }
    return estado;
}
    
    public static Empleado buscar(String dni){
        String sql = "select * from empleado where dni='"+dni+"'";
        Object[]f=Acceso.buscar(sql);
        if(f!=null){
            Empleado c = new Empleado(f[0].toString(),f[1].toString());
            return c;
        }
        return null;
    }
    
    public static List<Empleado>listar(){
        String sql="select * from empleado";
        List tabla=Acceso.listar(sql);
        List lis=new ArrayList();
        for (int i = 0; i < tabla.size(); i++) {
            Object[]f=(Object[])tabla.get(i);
            Empleado c=new Empleado();
            c.setDni(f[0].toString());
            c.setNom(f[1].toString());
            lis.add(c);
        }
        return lis;
    }
    
    public static String eliminar(String dni){
        String sql = "delete from empleado where dni='"+dni+"'";
        return Acceso.ejecutar(sql);
    }
    
    public static boolean autenticarEmpleado(String dni, String nombre) {
    String sql = "SELECT * FROM empleado WHERE dni=? AND nom=?";
    
    try {
        PreparedStatement ps = getConexion().prepareStatement(sql);
        ps.setString(1, dni);
        ps.setString(2, nombre);
        
        ResultSet rs = ps.executeQuery();
        
        // Si hay alguna fila en el resultado, las credenciales son válidas
        if (rs.next()) {
            return true;
        }
        
        rs.close();
        ps.close();
    } catch (SQLException e) {
        System.out.println("Error al autenticar: " + e.getMessage());
    }
    
    return false;
}

    
    public boolean buscarAdministradorInicioSesion(String dni, String nombre) {
        boolean iniciarSesion = false;

        try {
            Connection conexion = Acceso.getConexion();
            String consulta = "SELECT * FROM empleado WHERE dni=? AND nom=?";
            PreparedStatement sentenciaPreparada = conexion.prepareStatement(consulta);
            sentenciaPreparada.setString(1, dni);
            sentenciaPreparada.setString(2, nombre);
            ResultSet resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) {
                iniciarSesion = true; // El usuario puede iniciar Sesion por que esta registrado en la BD
            } else {
                iniciarSesion = false; // El usuario NO puede iniciar sesion por que no esta registrado en la BD
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

        System.out.println("El valor de iniciarSesion en el metodo es: " + iniciarSesion);
        return iniciarSesion;
    }

    

    public String buscarNombreAdministrador(String dni) {
        String nomb = null;
        try {
            Connection conexion = Acceso.getConexion();
            String consulta = "SELECT nom FROM empleado WHERE dni=?";
            PreparedStatement sentenciaPreparada = conexion.prepareStatement(consulta);
            sentenciaPreparada.setString(1, dni);
            ResultSet resultado = sentenciaPreparada.executeQuery();
            if (resultado.next()) { // El usuario fue encontrado y obtenemos el nombre
                nomb = resultado.getString("nom");
            } else {
                nomb = null; // EL usuario no fue encontrado y NO obtenemos el nombre
            }
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        }

        System.out.println("El valor del nombre en los Metodos SQL es : " + nomb);
        return nomb;
    }

    
}
