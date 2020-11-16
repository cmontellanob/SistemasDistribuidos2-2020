/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundosoquets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Carlos
 */
public class ClienteHolaMundo {

    public static void main(String[] args) {
        int port = 5001;
        try {
            Socket client = new Socket("localhost", port); 
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String result = fromServer.readLine();  
            System.out.println("cadena devuelta es: " + result);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
