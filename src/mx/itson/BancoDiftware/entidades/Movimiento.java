/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.entidades;

import java.util.Date;
import mx.itson.BancoDiftware.enumeradores.Tipo;

/**
 *  Esta clase representa una Movimiento y contienen propiedades que representan los datos de los Movimientos.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class Movimiento {
    private int id;
    private String descripcion;
    private double cantidad;
    private Date fecha;
    private Tipo tipo;

    /**
     * Obtiene la descripcion del movimiento.
     * @return descripcion del movimiento.x
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripcion del movimiento.
     * @param descripcion La descripcion del movimiento.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Establece la cantidad del movimiento.
     * @return la cantidad del movimiento.
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del movimiento.
     * @param cantidad la cantidad del movimiento.
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene la fecha del movimiento.
     * @return la fecha del movimiento.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del movimiento.
     * @param fecha la fecha del movimiento.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene los parametros de Tipo.
     * @return los parametros de Tipo.
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * Establece los parametros de Tipo.
     * @param tipo los parametros de Tipo.
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el id unico del movimiento.
     * @return el id unico del movimiento.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el id unico del movimiento.
     * @param id el id unico del movimiento.
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
