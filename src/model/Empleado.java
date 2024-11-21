/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author David
 */
public class Empleado extends Persona{
    private Double salario;

    public Empleado() {
    }

    public Empleado(Double salario, String dni, String nombre, String apellido, String telefono, boolean genero, String direccion) {
        super(dni, nombre, apellido, telefono, genero, direccion);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    
}
