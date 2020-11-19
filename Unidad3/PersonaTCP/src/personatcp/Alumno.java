/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personatcp;

import java.io.Serializable;

/**
 *
 * @author Carlos
 */
public class Alumno  implements Serializable {
    String nombre;
    String apellido;
    String cu;

    public Alumno(String nombre, String apellido, String cu) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cu = cu;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCu() {
        return cu;
    }

    public void setCu(String cu) {
        this.cu = cu;
    }
            
}
