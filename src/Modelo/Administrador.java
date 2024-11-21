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
public class Administrador extends Empleado {

    private String numContrato;
    private Date inicioContrato;
    private Date finContrato;

    public Administrador() {
    }

    public Administrador(String numContrato, Date inicioContrato, Date finContrato, double salario, String dni, String nombre, String apellido, String telefono, String genero, String direccion) {
        super(salario, dni, nombre, apellido, telefono, genero, direccion);
        this.numContrato = numContrato;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
    }

    private String getNumContrato() {
        return numContrato;
    }

    private void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    private Date getInicioContrato() {
        return inicioContrato;
    }

    private void setInicioContrato(Date inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    private Date getFinContrato() {
        return finContrato;
    }

    private void setFinContrato(Date finContrato) {
        this.finContrato = finContrato;
    }

}
