/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesumajava;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class ClienteSumaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Servicio.WsAritmeticaSoap ws =new Servicio.WsAritmeticaSoap(); 
        
        Servicio.SumarResponse sr= new Servicio.SumarResponse();
        
        System.out.println("El resultado es "+ws.sumar(a, b));
        
        
    }
        private static int sumar(int a, int b) {
        Servicio.WsAritmetica service = new Servicio.WsAritmetica();
        Servicio.WsAritmetica = service.getWsAritmeticaSoap()Port();
        return port.sumar(a, b);
    }
    
    
    
}