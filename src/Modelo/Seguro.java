/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author deton
 */
public class Seguro {
    private int id;
    private String accidentes;
    private ArrayList<Alumno> alumnos= new ArrayList<>();
    private Ambulancia ambulancia;
    private Aseguradora aseguradora;

    public Seguro() {
    }

    public Seguro(int id, String accidentes, Ambulancia ambulancia, Aseguradora aseguradora) {
        this.id = id;
        this.accidentes = accidentes;
        this.ambulancia = ambulancia;
        this.aseguradora = aseguradora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccidentes() {
        return accidentes;
    }

    public void setAccidentes(String accidentes) {
        this.accidentes = accidentes;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public Ambulancia getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(Ambulancia ambulancia) {
        this.ambulancia = ambulancia;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }
    
}
