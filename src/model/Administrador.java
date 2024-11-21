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
public class Administrador extends Empleado{
    private Integer numContrato;
    private Date inicioContrato;
    private Date finContrato;

    public Administrador() {
    }

    public Administrador(Integer numContrato, Date inicioContrato, Date finContrato, Double salario, String dni, String nombre, String apellido, String telefono, boolean genero, String direccion) {
        super(salario, dni, nombre, apellido, telefono, genero, direccion);
        this.numContrato = numContrato;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
    }

    public Integer getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(Integer numContrato) {
        this.numContrato = numContrato;
    }

    public Date getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(Date inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public Date getFinContrato() {
        return finContrato;
    }

    public void setFinContrato(Date finContrato) {
        this.finContrato = finContrato;
    }
    
    public void verificarGenero()throws Exception{
        if(isGenero()){
            throw new Exception("Error: Las auxiliares contables deben ser mujeres.");
        }else{
            System.out.println("Género verificado");
        }
    }
}
