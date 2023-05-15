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
import mx.itson.BancoDiftware.entidades.Movimiento;
import mx.itson.BancoDiftware.entidades.Operacion;

/**
 * Esta clase permite realizar operaciones CRUD en la tabla de Operacion de la base de datos.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class OperacionDAO {
    
    /**
     * Obtiene las operaciones de la tabla de Operacion en la base de datos bancodb.
     * @return Datos de las operaciones.
     */
    public static List <Operacion> obtener(){
     
        List <Operacion> operaciones = new ArrayList<>();
        
        
        try{
          Connection conexion = Conexion.get();
          Statement statement = conexion.createStatement();
          ResultSet rs = statement.executeQuery("SELECT * from operacion"); 
          
          while(rs.next()){
              Operacion o = new Operacion ();
              Movimiento mov = new Movimiento();
              Cliente cl = new Cliente();
              o.setId(rs.getInt(1));
              o.setCliente(rs.getString(2));
              o.setSaldoInicial(rs.getDouble(3));
              o.setSaldoFinal(rs.getDouble(4));
              o.setTotal(rs.getDouble(5));
          
              
              operaciones.add(o);
              
          }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,  "Ocurrio un error: " + e.toString());
        }
        return operaciones;
    }
    
    /**
     * Metodo para guardar operaciones dentro de la base de datos en la tabla operacion de la base de datos.
     * @param saldoInicial Saldo inicial del cliente.
     * @return Obtiene los datos y los guarda en la base de datos.
     */
    public static boolean guardar(double saldoInicial) {
        boolean resultado = false;
        try {
            Connection conexion = Conexion.get();
            String query = "INSERT INTO operacion (saldoInicial) VALUES (?)";
            PreparedStatement statement = conexion.prepareStatement(query);
            
            statement.setDouble(1, saldoInicial);
          
          

            statement.execute();

            resultado = statement.getUpdateCount() == 1;
            conexion.close();
            
        } catch (Exception e) {
            System.err.print("Error: " + e.getMessage());

        }
        return resultado;
    }
    
    
    
    
    
}
