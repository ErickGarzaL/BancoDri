/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.BancoDiftware.entidades.Movimiento;
import mx.itson.BancoDiftware.enumeradores.Tipo;

/**
 * Esta clase utiliza metodos para obtencion de Movimientos del Cliente dentro de la base de de datos bancodb.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class MovimientoDAO {
    
    
    /**
     * Obtiene los movimientos de la tabla de Movimiento de la base de datos bancodb.
     * @return Datos de los movimientos.
     */
    public static List <Movimiento> obtener(){
        
        List<Movimiento> movimientos = new ArrayList<>();
        
        try{
            Connection conexion = Conexion.get();
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from movimiento");
            
            while(rs.next()){
                Movimiento m = new Movimiento ();
                
                m.setId(rs.getInt(1));
                m.setDescripcion(rs.getString(2));
                m.setCantidad(rs.getDouble(3));
                m.setFecha(rs.getDate(4));
                m.setTipo(rs.getInt(5) == 1? Tipo.APROBADO: Tipo.DENEGADO);
                
                movimientos.add(m);
            }
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error: " + e.toString());
        }
        
        return movimientos;
    } 
    
}
