/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author David
 */
public class Profesor extends Empleado{
    private String especialidad;
    private Date fechaNacimiento;

    public Profesor() {
    }

    public Profesor(String especialidad, Date fechaNacimiento, Double salario, String dni, String nombre, String apellido, String telefono, boolean genero, String direccion) {
        super(salario, dni, nombre, apellido, telefono, genero, direccion);
        this.especialidad = especialidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
