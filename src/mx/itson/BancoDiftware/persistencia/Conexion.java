/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Conexion a MySQL meidante JDBC.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class Conexion {
    
    /**
     * Metodo que devuelve una conexion a una base de datos en MySQL.
     * Establece una conexion con la base de datos bancodb mediante la clase DriverManager.
     * Si la conexion es exitosa el objeto Connection es devuelto.
     * Si ocurre un error durante la conexion, se captura la excepción.
     * @return Conexion a la base de datos de MySQL.
     */
         public static Connection get(){
     Connection conexion = null;
     
     try{
         conexion = DriverManager.getConnection("jdbc:mysql://localhost/bancodb?user=root&password=admin");
     }catch (Exception ex){
         System.err.print("Ocurrio un error" + ex.getMessage());
     }
     return conexion;
    }
}
