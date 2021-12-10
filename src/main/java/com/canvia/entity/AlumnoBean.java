package com.canvia.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class AlumnoBean {

    private String dni;

    private String nombre;

    private String apellido;

    private String celular;

    private int indEstado;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getIndEstado() {
        return indEstado;
    }

    public void setIndEstado(int indEstado) {
        this.indEstado = indEstado;
    }
}
