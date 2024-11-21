/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author David
 */
public class Alumno extends Persona{
    private Integer edad;
    private Responsable padre;
    private Double matricula;

    public Alumno() {
    }

    public Alumno(Integer edad, Responsable padre, Double matricula, String dni, String nombre, String apellido, String telefono, boolean genero, String direccion) {
        super(dni, nombre, apellido, telefono, genero, direccion);
        this.edad = edad;
        this.padre = padre;
        this.matricula = matricula;
    }

    public Integer getFechaNacimiento() {
        return edad;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        this.edad = fechaNacimiento;
    }

    public Responsable getPadre() {
        return padre;
    }

    public void setPadre(Responsable padre) {
        this.padre = padre;
    }

    public Double getMatricula() {
        return matricula;
    }

    public void setMatricula(Double matricula) {
        this.matricula = matricula;
    }
    
    public void verificarCategoria(){
        String categoria = Categoria.getRango(edad);
        System.out.println("El Alumno pertenece a la categoria: " + categoria);
    }
}
