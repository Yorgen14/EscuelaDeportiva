/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escueladeportiva;

import model.Alumno;
import model.Responsable;

/**
 *
 * @author David
 */
public class EscuelaDeportiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void descuentoHermanos(Responsable padre){
        if(padre.getAlumno().size() > 1){
            for(Alumno alumno: padre.getAlumno()){
                double nuevaMatricula = alumno.getMatricula() * 0.9;
                alumno.setMatricula(nuevaMatricula);
            }
        }
    }
}
