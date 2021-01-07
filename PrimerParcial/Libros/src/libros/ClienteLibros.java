/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

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
public class ClienteLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IOperacion operacion;
        Libro uno=new Libro("los misioneros","Juan Perez","La Hoguera",2020);

        try {
            operacion=(IOperacion)Naming.lookup("rmi://localhost/Operacion");
            Libro resultado=operacion.Operacion(uno, Accion.crear);
            System.out.print(resultado);
            
            
            
            
        } catch (NotBoundException ex) {
            Logger.getLogger(ClienteLibros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ClienteLibros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ClienteLibros.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }
    
}
