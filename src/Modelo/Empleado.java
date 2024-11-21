/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author deton
 */
public class Empleado extends Persona{
    private double salario;

    public Empleado() {
    }

    public Empleado(double salario, String dni, String nombre, String apellido, String telefono, String genero, String direccion) {
        super(dni, nombre, apellido, telefono, genero, direccion);
        this.salario = salario;
    }

    private double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }
    
}
