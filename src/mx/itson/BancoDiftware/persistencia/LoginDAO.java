/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.BancoDiftware.entidades.Cliente;
import mx.itson.BancoDiftware.ui.Inicio;

/**
 *  Esta clase permite ralizar operaciones CRUD en la tabla clientes de la base de datos.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class LoginDAO {
    
    /**
     * Guarda nombre y contraseña del usuario para iniciar sesion dentro del sistema.
     * @param nombre Nombre del usuario.
     * @param contraseña Contraseña del usuario.
     */
    public void guardarUsuario(String nombre, String contraseña){
        Conexion db = new Conexion();
        String sql = "insert into cliente(nombre, contraseña) values ('" + nombre +"', '" + contraseña +"');";
        Statement st;
        Connection conexion = Conexion.get();
        try
        {
            st = conexion.createStatement();
            int rs = st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        }catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    
    
    /**
     * Consulta al usuario su nombre y contraseña para su inicio de sesion dentro del sistema
     * Si es correcto, el sistema muestra un panel e inicia sesión
     * Si es incorrecto el sistema el sistema captura la excepción y muestra un panel.
     * @param user Nombre del Usuario.
     * @param pass Constraseña del Usuario.
     */
    public void consultarUsuario(String user, String pass)
    {
       
        Conexion db = new Conexion();
        // Se inicializa a null
        String usuarioCorrecto = null;
        String passCorrecto = null;
    try {

        Connection cn = Conexion.get();
        PreparedStatement pst = cn.prepareStatement("SELECT nombre, contraseña FROM cliente");
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            usuarioCorrecto = rs.getString(1);
            passCorrecto = rs.getString(2);
        }

        if (user.equals(usuarioCorrecto) && pass.equals(passCorrecto)) {
            JOptionPane.showMessageDialog(null, "Login correcto Bienvenido " + user);
            Inicio obj = new Inicio();
            obj.setVisible(true);
            obj.setLocationRelativeTo(null);
            
        } else if (!user.equals(usuarioCorrecto) || pass.equals(passCorrecto)) {

            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error " + e);
    }
    }
    
    /**
     * Obtiene los usuarios de la tabla cliente en la base de datos bancodb.
     * @return Cliente.
     */
     public static List <Cliente> obtener(){
     
        List <Cliente> clientes = new ArrayList<>();
        
        
        try{
          Connection conexion = Conexion.get();
          Statement statement = conexion.createStatement();
          ResultSet rs = statement.executeQuery("SELECT * from cliente"); 
          
          while(rs.next()){
              Cliente c = new Cliente ();
              c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setContraseña(rs.getString(3));
              
              clientes.add(c);
              
          }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,  "Ocurrio un error: " + e.toString());
        }
        return clientes;
    }
    
    
    
    
    
    
    
}
