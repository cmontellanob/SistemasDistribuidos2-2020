/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Carlos
 */
public class Resta implements ICalculo {
    int b;
    int c;

    public Resta(int b, int c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void calcular() {
       int r=b-c; 
      System.out.println("La resta es"+r);
    }
    
}
