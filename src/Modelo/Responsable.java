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
public class Responsable extends Persona{
    private String email;
    private ArrayList<Alumno> hijos = new ArrayList<>();

    public Responsable(String email, String dni, String nombre, String apellido, String telefono, String genero, String direccion) {
        super(dni, nombre, apellido, telefono, genero, direccion);
        this.email = email;
    }

    public Responsable() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Alumno> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Alumno> hijos) {
        this.hijos = hijos;
    }
    
}
