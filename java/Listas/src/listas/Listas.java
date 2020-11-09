/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> autos = new ArrayList<String>();
    autos.add("Volvo");
    autos.add("BMW");
    autos.add("Ford");
    autos.add("Mazda");
    autos.add("Toyota");
    System.out.println(autos);
    for (String elemento:autos)
        System.out.println(elemento);
    }
    
}
