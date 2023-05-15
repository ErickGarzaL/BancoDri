/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.entidades;

import java.util.List;

/**
 *  Esta clase representa una Cuenta y contienen propiedades que representan los datos de una Cuenta.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class Cuenta {
    private Cliente cliente;
    private List<Movimiento> movimientos;
    private Operacion operacion;
    private String moneda;

    /**
     * Obtiene los parametros de cliente.
     * @return Parametros de cliente.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece los parametros de cliente.
     * @param cliente los parametros de cliente.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtiene una lista de movimientos.
     * @return Lista de movimientos.
     */
    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    /**
     * Establece una lista de movimientos.
     * @param movimientos lista de movimientos.
     */
    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    /**
     * Obtiene los parametros de operacion.
     * @return parametros de operacion.
     */
    public Operacion getOperacion() {
        return operacion;
    }

    /**
     * Establece los los parametros de operacion.
     * @param operacion los parametros de operacion.
     */
    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    /**
     * Obtiene una moneda.
     * @return una moneda.
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * Establece una moneda.
     * @param moneda una moneda.
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    
            
}
