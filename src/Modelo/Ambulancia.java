/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author deton
 */
public class Ambulancia {
    private int id;
    private int contacto;
    private String eps;
    private Aseguradora aseguradora;

    public Ambulancia() {
    }

    public Ambulancia(int id, int contacto, String eps, Aseguradora aseguradora) {
        this.id = id;
        this.contacto = contacto;
        this.eps = eps;
        this.aseguradora = aseguradora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }
    
    
}
