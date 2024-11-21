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
public class Partido {
    private Integer marcador;
    private Persona arbitro;
    private Date hora;
    private String contrincante;
    private Double valorArbitro;

    public Partido() {
    }

    public Partido(Integer marcador, Persona arbitro, Date hora, String contrincante, Double valorArbitro) {
        this.marcador = marcador;
        this.arbitro = arbitro;
        this.hora = hora;
        this.contrincante = contrincante;
        this.valorArbitro = valorArbitro;
    }

    public Integer getMarcador() {
        return marcador;
    }

    public void setMarcador(Integer marcador) {
        this.marcador = marcador;
    }

    public Persona getArbitro() {
        return arbitro;
    }

    public void setArbitro(Persona arbitro) {
        this.arbitro = arbitro;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getContrincante() {
        return contrincante;
    }

    public void setContrincante(String contrincante) {
        this.contrincante = contrincante;
    }

    public Double getValorArbitro() {
        return valorArbitro;
    }

    public void setValorArbitro(Double valorArbitro) {
        this.valorArbitro = valorArbitro;
    }
    
    
}
