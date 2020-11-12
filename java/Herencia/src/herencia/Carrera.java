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
class Carrera {
    private String nombre;
    private String nombrecorto;
    private int codigo;

    public Carrera(String nombre, String nombrecorto, int codigo) {
        this.nombre = nombre;
        this.nombrecorto = nombrecorto;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrecorto() {
        return nombrecorto;
    }

    public void setNombrecorto(String nombrecorto) {
        this.nombrecorto = nombrecorto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Carrera: nombre="+ nombre+" codigo="+codigo;
    }
    
    
    
    
}
