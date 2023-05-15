/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.entidades;

import java.util.Date;

/**
 *  Esta clase representa los calculos de credito y contienen propiedades que representan los datos de un Credito.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class CalculadoraCredito {
    private SolicitudCredito solicitud;
    private Date fecha;
    private double tasaIntereses;
    private String codigo;

    /**
     * Obtiene la solicitud de credito.
     * @return La solicitud de credito.
     */
    public SolicitudCredito getSolicitud() {
        return solicitud;
    }

    /**
     * Establece la solicitud de credito.
     * @param solicitud La solicitud de credito.
     */
    public void setSolicitud(SolicitudCredito solicitud) {
        this.solicitud = solicitud;
    }

    /**
     * Obtiene la fecha de la solicitud.
     * @return La fecha de la solicitud.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la solicitud.
     * @param fecha La fecha de la solicitud.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la tasa de interes.
     * @return la tasa de interes.
     */
    public double getTasaIntereses() {
        return tasaIntereses;
    }

    /**
     * Establece la tasa de interes.
     * @param tasaIntereses la tasa de interes.
     */
    public void setTasaIntereses(double tasaIntereses) {
        this.tasaIntereses = tasaIntereses;
    }

    /**
     * Obtiene el codigo.
     * @return el codigo.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el codigo.
     * @param codigo el codigo.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
