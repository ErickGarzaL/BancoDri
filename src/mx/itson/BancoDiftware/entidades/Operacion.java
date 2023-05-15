/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.entidades;

import java.util.Date;

/**
 *  Esta clase representa una Operacion y contienen propiedades que representan los datos de las Operaciones.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class Operacion {
    private int id;
    private double saldoInicial;
    private double SaldoFinal;
    private Movimiento  movimiento;
    private double deposito;
    private double retiro;
    private double total;
    private Date fecha;
    private String cliente;

    /**
     * Obtiene el saldo inicial del cliente.
     * @return el saldo inicial del cliente.
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * Establece el saldo inicial del cliente.
     * @param saldoInicial el saldo inicial del cliente.
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * Obtiene el saldo final del cliente.
     * @return el saldo final del cliente.
     */
    public double getSaldoFinal() {
        return SaldoFinal;
    }

    /**
     * Establece el saldo final del cliente.
     * @param SaldoFinal el saldo final del cliente.
     */
    public void setSaldoFinal(double SaldoFinal) {
        this.SaldoFinal = SaldoFinal;
    }

    /**
     * Obtiene parametros de movimiento.
     * @return parametros de movimiento.
     */
    public Movimiento getMovimiento() {
        return movimiento;
    }

    /**
     * Establece parametros de movimiento.
     * @param movimiento parametros de movimiento.
     */
    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }

    /**
     * Obtiene depositos.
     * @return depositos.
     */
    public double getDeposito() {
        return deposito;
    }

    /**
     * Establece depositos.
     * @param deposito depositos.
     */
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    /**
     * Obtiene retiros.
     * @return retiros.
     */
    public double getRetiro() {
        return retiro;
    }

    /**
     * Establece retiros.
     * @param retiro retiros.
     */
    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    /**
     * Obtiene un total de operacion.
     * @return total de operacion.
     */
    public double getTotal() {
        return total;
    }

    /**
     * Establece un total de operacion.
     * @param total total de operacion.
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
    /**
     * Obtiene una fecha de operacion.
     * @return una fecha de operacion.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece una fecha de operacion.
     * @param fecha una fecha de operacion.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene un id unico de operacion.
     * @return id unico de operacion.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece id unico de operacion.
     * @param id id unico de operacion.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene un cliente.
     * @return un cliente.
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Establece un cliente.
     * @param cliente un cliente.
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

   
}
