/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Base64;

/**
 *
 * @author Carlos
 */
public class ServerPrimo {
  public static boolean esPrimo(int n)
  { boolean aux=true;
   for (int i=2;i<=n/2;i++)
   {
       if (n%i==0)
          aux=false; 
   }
               
  return aux;    
  }
  public static void main (String args[]) { 
    int port=6789;  
    try {
      
      DatagramSocket socketUDP = new DatagramSocket(port);
      byte[] bufer = new byte[1000];

      while (true) {
        // Construimos el DatagramPacket para recibir peticiones
        DatagramPacket peticion =
          new DatagramPacket(bufer, bufer.length);

        // Leemos una petición del DatagramSocket
        socketUDP.receive(peticion);

       /* System.out.print("Datagrama recibido del host: " +
                           peticion.getAddress());
        System.out.println(" desde el puerto remoto: " +
                           peticion.getPort());
        */
        // Construimos el DatagramPacket para enviar la respuesta
        int numero = convertByteArrayToInt2(peticion.getData());
        //int numero=Integer.parseInt(cadenaNumero);
        System.out.println(numero);
        String resultado=""; 
        if (esPrimo(numero))
            resultado="SI es primo";
        else
            resultado="NO es primo ";
            
        DatagramPacket respuesta =
          new DatagramPacket(resultado.getBytes(), resultado.length(),
                             peticion.getAddress(), peticion.getPort());

        // Enviamos la respuesta, que es un eco
        socketUDP.send(respuesta);
      }

    } catch (SocketException e) {
      System.out.println("Socket: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO: " + e.getMessage());
    }
  }

    private static int convertByteArrayToInt2(byte[] data) {
       return ((data[0] & 0xFF) << 24) |
                ((data[1] & 0xFF) << 16) |
                ((data[2] & 0xFF) << 8) |
                ((data[3] & 0xFF) << 0); }

}

    

