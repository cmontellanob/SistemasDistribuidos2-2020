/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personatcp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Carlos
 */
public class ServidorAlumnos {

    public static void main(String[] args) {
        int port = 5001; 
        Operacion o;
    while (true)
    {        
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Se inicio el servidor");
            Socket client;
            PrintStream toClient;       
            client = server.accept(); 
            //BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            DataInputStream  fromClient  = new DataInputStream(client.getInputStream());
            System.out.println("Cliente se conecto");
            String mensajeServidor=fromClient.toString();
                System.out.println(mensajeServidor);
            // System.out.println(fromClient.readLine());
            toClient = new PrintStream(client.getOutputStream()); 
            toClient.println("Respuesta");
            System.out.println("Cliente se conecto");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    }
}
