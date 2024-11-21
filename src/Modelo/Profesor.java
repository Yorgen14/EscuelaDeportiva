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
public class Profesor extends Empleado {
    private String especialidad;
    private Date fechaNac;

    public Profesor() {
    }

    public Profesor(String especialidad, Date fechaNac, double salario, String dni, String nombre, String apellido, String telefono, String genero, String direccion) {
        super(salario, dni, nombre, apellido, telefono, genero, direccion);
        this.especialidad = especialidad;
        this.fechaNac = fechaNac;
    }

    private String getEspecialidad() {
        return especialidad;
    }

    private void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    private Date getFechaNac() {
        return fechaNac;
    }

    private void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
}
