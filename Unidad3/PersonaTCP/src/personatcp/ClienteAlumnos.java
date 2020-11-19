package personatcp;

import java.io.*;
import java.net.*;

public class ClienteAlumnos {
    public static void main(String[] args){
        int port = 5001; // puerto de comunicacion
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            Alumno a=new Alumno("Juan", "Perez", "110-25");
            Operacion o=new Operacion(a,Operacion.Accion.Crear);
            
            
            Socket client = new Socket("localhost", port); //conectarse al socket
            DataOutputStream toServer = new DataOutputStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
            toServer.writeBytes(o.toString());  //mandar alservidor 
            String result = fromServer.readLine();  // devolver del servidor
            System.out.println("cadena devuelta es: "+result);
            
           

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
