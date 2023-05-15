/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.entidades;

import mx.itson.BancoDiftware.enumeradores.Estado;

/**
 *  Esta clase representa una Solicitud de credito y contienen propiedades que representan los datos de las Solicitudes de credito.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class SolicitudCredito {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double cantidadPerdida;
    private Estado estado;

    /**
     * Obtiene parametros de Cliente.
     * @return parametros de Cliente.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece parametros de Cliente.
     * @param cliente parametros de Cliente.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene parametros de vehiculo.
     * @return parametros de vehiculo.
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece parametros de vehiculo.
     * @param vehiculo parametros de vehiculo.
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene una cantidad perdida.
     * @return una cantidad perdida.
     */
    public double getCantidadPerdida() {
        return cantidadPerdida;
    }

    /**
     * Establece una cantidad perdida.
     * @param cantidadPerdida una cantidad perdida.
     */
    public void setCantidadPerdida(double cantidadPerdida) {
        this.cantidadPerdida = cantidadPerdida;
    }

    /**
     * Obtiene parametros de Estado.
     * @return parametros de Estado.
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Establece parametros de Estado.
     * @param estado parametros de Estado.
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
