/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Alumno extends Persona {
    private ArrayList<Carrera> carreras = new ArrayList<Carrera>();
    String CU;
     public Alumno(String nombre, String apellidos, int edad, Sexo sexo,String CU) {
        super(nombre, apellidos, edad, sexo);
        this.CU=CU;
    }

    public String getCU() {
        return CU;
    }

    public void setCU(String CU) {
        this.CU = CU;
    }
   public void addCarrera(Carrera carrera)
   {
       this.carreras.add(carrera);
   }
   
   public void listarCarreras()
   {
       for(Carrera carrera:carreras)
       {
           System.out.println(carrera);
       }
       
   }
}
