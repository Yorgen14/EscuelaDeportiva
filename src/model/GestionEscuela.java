/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author David
 */
public class GestionEscuela {
    private Double valorMatricula, valorPension;

    public GestionEscuela() {
    }

    public GestionEscuela(Double valorMatricula, Double valorPension) {
        this.valorMatricula = valorMatricula;
        this.valorPension = valorPension;
    }

    public Double getValorMatricula() {
        return valorMatricula;
    }

    public void setValorMatricula(Double valorMatricula) {
        this.valorMatricula = valorMatricula;
    }

    public Double getValorPension() {
        return valorPension;
    }

    public void setValorPension(Double valorPension) {
        this.valorPension = valorPension;
    }
    
    
}
