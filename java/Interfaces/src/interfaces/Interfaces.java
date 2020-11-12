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
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma s=new Suma(3,4);
        s.calcular();
        Resta r=new Resta(10,5);
        r.calcular();
        ICalculo[] calculos=new ICalculo[2];
        calculos[0]=s;
        calculos[1]=r;
        
        for(ICalculo calculo:calculos)
        {
            calculo.calcular();
            
        }
        
    }
    
}
