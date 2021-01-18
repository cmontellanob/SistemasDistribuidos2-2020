/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientejavajava;

import Servicio.WsAritmeticaJava;
import Servicio.WsAritmeticaJava_Service;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ClienteJavaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("La suma es:"+sumar(a,b));
    }

    private static int sumar(int a, int b) {
        WsAritmeticaJava_Service service = new WsAritmeticaJava_Service();
        WsAritmeticaJava port = service.getWsAritmeticaJavaPort();
        return port.sumar(a, b);
    }
    
}
