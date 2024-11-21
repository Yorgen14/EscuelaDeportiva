/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author deton
 */
public class Alumno extends Persona{
    private Date fechaNac;
    private Categoria categoria;

    public Alumno() {
    }

    public Alumno(Date fechaNac, Categoria categoria, String dni, String nombre, String apellido, String telefono, String genero, String direccion) {
        super(dni, nombre, apellido, telefono, genero, direccion);
        this.fechaNac = fechaNac;
        this.categoria = categoria;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    
    
}
