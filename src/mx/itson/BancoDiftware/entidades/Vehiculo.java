/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.entidades;

/**
 *  Esta clase representa un Vehiculo y contienen propiedades que representan los datos de un Vehiculo.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class Vehiculo {
    private int año;
    private String marca;
    private String modelo;
    private double precio;

    /**
     * Obtiene año del vehiculo.
     * @return año del vehiculo.
     */
    public int getAño() {
        return año;
    }

    /**
     * Establece año del vehiculo.
     * @param año año del vehiculo.
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * Obtiene marca del vehiculo.
     * @return marca del vehiculo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece marca del vehiculo.
     * @param marca marca del vehiculo.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene modelo del vehiculo.
     * @return modelo del vehiculo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece modelo del vehiculo.
     * @param modelo modelo del vehiculo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene precio del vehiculo.
     * @return precio del vehiculo.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece precio del vehiculo.
     * @param precio precio del vehiculo.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
            
}
