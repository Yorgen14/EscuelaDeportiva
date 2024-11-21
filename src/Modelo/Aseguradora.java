/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author deton
 */
public class Aseguradora {
    private String nit;
    private String razonSocial;
    private String direccion;
    private String telefono;

    public Aseguradora() {
    }

    public Aseguradora(String nit, String razonSocial, String direccion, String telefono) {
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    private String getNit() {
        return nit;
    }

    private void setNit(String nit) {
        this.nit = nit;
    }

    private String getRazonSocial() {
        return razonSocial;
    }

    private void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    private String getDireccion() {
        return direccion;
    }

    private void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private String getTelefono() {
        return telefono;
    }

    private void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
