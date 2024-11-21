/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author David
 */
public class Categoria {
    private String descripcion, rango;

    public Categoria() {
    }

    public Categoria(String descripcion, String rango) {
        this.descripcion = descripcion;
        this.rango = rango;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
    public static String getRango(int edad) {
        if(edad > 4 && edad < 11){
            return "Infantil";
        }else if(edad >= 10 && edad <= 14){
            return "Juvenil";
        }else if(edad >=15 && edad <= 18){
            return "Mayor";
        }else{
            return "Edad fuera de rango";
        }
    }
}
