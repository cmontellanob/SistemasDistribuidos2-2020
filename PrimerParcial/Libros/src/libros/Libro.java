/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

import java.io.Serializable;

/**
 *
 * @author Carlos
 */
public class Libro implements Serializable {
    int id;
    String titulo;
    String autor;
    String editorial;
    int anio;

    public Libro(String titulo, String autor, String editorial, int anio) {
        this.id=1;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
}
