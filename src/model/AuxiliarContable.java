/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author David
 */
public class AuxiliarContable extends Empleado{
    private Integer edad;

    public AuxiliarContable() {
    }

    public AuxiliarContable(Integer edad, Double salario, String dni, String nombre, String apellido, String telefono, boolean genero, String direccion) {
        super(salario, dni, nombre, apellido, telefono, genero, direccion);
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) throws Exception {
        if(edad < 25|| edad > 35 ){
            throw new Exception("Error: la edad de la auxiliar contable debe estar"
                    + " entre los 25 y 35 años");
        }else{
            System.out.println("Edad Verificada");
        }
    }
    
    public void verificarGenero()throws Exception{
        if(isGenero()){
            throw new Exception("Error: Las auxiliares contables deben ser mujeres.");
        }else{
            System.out.println("Género verificado");
        }
    }
    
}
