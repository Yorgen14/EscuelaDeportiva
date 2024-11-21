/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author deton
 */
public class Partido {
    private int id;
    private String marcador;
    private String arbitro;
    private int hora;
    private String Contrincante;
    private double ValorArbitro;
    private Campeonato campeonato;

    public Partido() {
    }

    public Partido(int id, String marcador, String arbitro, int hora, String Contrincante, double ValorArbitro, Campeonato campeonato) {
        this.id = id;
        this.marcador = marcador;
        this.arbitro = arbitro;
        this.hora = hora;
        this.Contrincante = Contrincante;
        this.ValorArbitro = ValorArbitro;
        this.campeonato = campeonato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public String getArbitro() {
        return arbitro;
    }

    public void setArbitro(String arbitro) {
        this.arbitro = arbitro;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getContrincante() {
        return Contrincante;
    }

    public void setContrincante(String Contrincante) {
        this.Contrincante = Contrincante;
    }

    public double getValorArbitro() {
        return ValorArbitro;
    }

    public void setValorArbitro(double ValorArbitro) {
        this.ValorArbitro = ValorArbitro;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }
    
}
