/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

public class Usuario {

    public Usuario(String nombre, String apellido, String correoElectronico, String telefono, 
            String contrasena, Date fechaNacimiento, Date fechaUltimoAcceso, boolean administrador) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaUltimoAcceso = fechaUltimoAcceso;
        this.administrador = administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaUltimoAcceso() {
        return fechaUltimoAcceso;
    }

    public void setFechaUltimoAcceso(Date fechaUltimoAcceso) {
        this.fechaUltimoAcceso = fechaUltimoAcceso;
    }

    public boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", correoElectronico=" + correoElectronico + ", telefono=" + telefono + ", contrasena=" + contrasena + ", fechaNacimiento=" + fechaNacimiento + ", fechaUltimoAcceso=" + fechaUltimoAcceso + ", administrador=" + administrador + '}';
    }
    
    
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String telefono;
    private String contrasena;
    private Date fechaNacimiento;
    private Date fechaUltimoAcceso;
    private boolean administrador;// true si el usuario es administrador
    
}
