/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author deton
 */
public class AuxiliarContable extends Empleado{
    private int edad;

    public AuxiliarContable() {
    }

    public AuxiliarContable(int edad, double salario, String dni, String nombre, String apellido, String telefono, String genero, String direccion) {
        super(salario, dni, nombre, apellido, telefono, genero, direccion);
        this.edad = edad;
    }

    private int getEdad() {
        return edad;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }
    
}
