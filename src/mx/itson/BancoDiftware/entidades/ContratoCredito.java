/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.entidades;

import java.util.Date;

/**
 *  Esta clase representa un Contrato de credito y contienen propiedades que representan los datos de un Contrato.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class ContratoCredito {
    private Date fechaInicio;
    private String cuota;
    private double saldoPediente;
    private CalculadoraCredito calculadoraCredito;

    /**
     * Obtiene fecha de inicio del contrato.
     * @return fecha de inicio del contrato.
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Establece fecha de inicio del contrato.
     * @param fechaInicio fecha de inicio del contrato.
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Obtiene la cuota del contrato.
     * @return cuota del contrato.
     */
    public String getCuota() {
        return cuota;
    }

    /**
     * Establece la cuota del contrato.
     * @param cuota cuota del contrato.
     */
    public void setCuota(String cuota) {
        this.cuota = cuota;
    }

    /**
     * Obtiene el saldo pendiente.
     * @return saldo pendiente.
     */
    public double getSaldoPediente() {
        return saldoPediente;
    }

    /**
     * Establece el saldo pendiente.
     * @param saldoPediente el saldo pendiente.
     */
    public void setSaldoPediente(double saldoPediente) {
        this.saldoPediente = saldoPediente;
    }

    /**
     * Obtiene los parametros de la clase CalculadoraCredito.
     * @return parametros de la clase CalculadoraCredito.
     */
    public CalculadoraCredito getCalculadoraCredito() {
        return calculadoraCredito;
    }

    /**
     * Establece los parametros de la clase CalculadoraCredito.
     * @param calculadoraCredito parametros de la clase CalculadoraCredito.
     */
    public void setCalculadoraCredito(CalculadoraCredito calculadoraCredito) {
        this.calculadoraCredito = calculadoraCredito;
    }
}
