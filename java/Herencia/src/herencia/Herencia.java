/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Carlos
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a1=new Alumno("Carlos","Perez",35,Sexo.MASCULINO,"35-215");
        System.out.println(a1.getNombre());
        System.out.println(a1.getCU());
        a1.addCarrera(new Carrera("Ingenieria en Ciencas de la Computacion","Ing. en Ciencias de la Computacion",35));
        a1.listarCarreras();
        
    }
    
}
