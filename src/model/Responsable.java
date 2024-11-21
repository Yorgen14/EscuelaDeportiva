/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author David
 */
public class Responsable extends Persona{
    private String email;
    private List<Alumno> alumno;

    public Responsable() {
    }


    public Responsable(String email, List<Alumno> alumno, String dni, String nombre, String apellido, String telefono, boolean genero, String direccion) {
        super(dni, nombre, apellido, telefono, genero, direccion);
        this.email = email;
        this.alumno = alumno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Alumno> getAlumno() {
        return alumno;
    }

    public void addAlumno(Alumno alumno){
        this.alumno.add(alumno);
    }
    
    
    
}
