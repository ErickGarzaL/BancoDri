/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.BancoDiftware.entidades;

/**
 * Esta clase representa a Cliente y contienen propiedades que representan los datos de un Cliente.
 * @author Erick Garza, Emmanuel Rivas y Carlos Cadena.
 */
public class Cliente {
    
    private int id;
    String nombre;
    String telefono;
    String correo;
    String domicilio;
    String contraseña;

    /**
     * Obtiene el nombre del cliente.
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * @param nombre El nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el telefono del cliente.
     * @return El telefono del cliente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el telefono del cliente.
     * @param telefono Telefono del cliente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el correo del cliente.
     * @return el correo del cliente.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo del cliente.
     * @param correo el correo del cliente.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el domicilio del cliente.
     * @return el domicilio del cliente.
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Establece el domicilio del cliente.
     * @param domicilio el domicilio del cliente.
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Obtiene la contraseña del cliente.
     * @return 
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Establece la contraseña del cliente.
     * @param contraseña la contraseña del cliente.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * Obtiene el id unico del cliente
     * @return id unico del cliente.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el id unico del cliente.
     * @param id id unico del cliente.
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
