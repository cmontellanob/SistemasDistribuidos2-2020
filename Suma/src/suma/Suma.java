/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=0;
        int b=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor de a ");
        a=sc.nextInt();
        System.out.println("Introduzca el valor de b ");
        b=sc.nextInt();
        int c=a+b;
        System.out.println("El resultado es:"+c);
        
        
        
    }
    
}
