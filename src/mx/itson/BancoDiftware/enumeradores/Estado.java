/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.enumeradores;

/**
 * Este enumerador representa el tipo de movimiento que se realizó.
 * Donde los valores posibles son DEPOSITO, RETIRO.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public enum Estado {
    
    DEPOSITO (1),
    RETIRO(2);
    private int numero;
    Estado(int numero ){
        this.numero = numero;
    }
}
