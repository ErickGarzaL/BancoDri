/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.enumeradores;

/**
 * Este enumerador representa la aprobación o negación de un credito.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public enum Tipo {
    APROBADO (1),
    DENEGADO (2);
    
    private int numero;
    Tipo(int numero ){
        this.numero = numero;
    }
    
}
