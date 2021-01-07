/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ClienteOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NotBoundException {
        IOperaciones operacion;
        try {
            operacion = (IOperaciones) Naming.lookup("rmi://localhost/Operaciones");
            int op = 0;
            Scanner sc = new Scanner(System.in);
            int n = 0;
            String cadena = "";
            while (op != 4) {
                System.out.println("***************************");
                System.out.println("1. Sumatoria");
                System.out.println("2. Factorial");
                System.out.println("3. Invertir");
                System.out.println("4. Salir");
                System.out.println("***************************");
                System.out.println("elija una opción");
                op = sc.nextInt();

                switch (op) {
                    case 1: {
                        System.out.println("introduzca el valor de n");
                        n = sc.nextInt();
                        System.out.println("la sumatoria es" + operacion.sumatoria(n));
                        break;
                    }
                    case 2: {
                        System.out.println("introduzca el valor de n");
                        n = sc.nextInt();
                        System.out.println("la factorial es" + operacion.factorial(n));
                        break;
                    }
                    case 3: {
                        System.out.println("introduzca cadena");
                        cadena = sc.next();
                        System.out.println("la cadenainvertida es " + operacion.invertircadena(cadena));
                        break;
                    }

                }
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteOperaciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}


