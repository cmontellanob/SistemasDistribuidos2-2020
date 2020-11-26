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
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Carlos
 */
public class ServidorAlumnos {

    public static void main(String[] args) throws ClassNotFoundException {
        int port = 5001;
        try {
            while (true) {

                ServerSocket server = new ServerSocket(port);
                System.out.println("Se inicio el servidor");
                Socket client;
                PrintStream toClient;
                client = server.accept();
                ObjectInputStream fromClient = new ObjectInputStream(client.getInputStream());
                System.out.println("Cliente se conecto");
                Operacion o = (Operacion) fromClient.readObject(); //cast :  convertir
                              {
                System.out.println(o.alumno.getApellido());
                }
                    System.out.println(o.alumno.getNombre());
                toClient = new PrintStream(client.getOutputStream());
                toClient.println("Respuesta");
                System.out.println("Cliente se conecto");

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
