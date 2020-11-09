/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String[] vector=new String[5];
       int[][] matriz=new int[3][2];
       Scanner sc = new Scanner(System.in);
       for (int i=0;i<vector.length;i++)
       {
         System.out.println("Introduzca Nombre ");
         vector[i]=sc.next();
       }
       
       for (String valor:vector)
       {
         System.out.println(valor);
       }
       
         for (int i=0;i<3;i++)
           for (int j=0;j<2;j++)
           {
          System.out.println("Introduzca valor ");
           matriz[i][j]=sc.nextInt();
           }
         
         for (int i=0;i<3;i++)
         {
           for (int j=0;j<2;j++)
           {
          System.out.print(matriz[i][j]);
          
           }
           System.out.println();
         }
    }
    
}
