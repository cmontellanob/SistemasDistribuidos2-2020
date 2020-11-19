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
public class Operacion implements Serializable {
    Alumno alumno;
    Accion accion;

    public Operacion(Alumno alumno, Accion accion) {
        this.alumno = alumno;
        this.accion = accion;
    }


    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    enum Accion{Crear,Leer,Eliminar,Editar} ;
}


