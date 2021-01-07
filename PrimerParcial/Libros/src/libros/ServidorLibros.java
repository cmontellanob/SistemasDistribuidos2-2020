/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Carlos
 */
public class ServidorLibros extends UnicastRemoteObject
        implements IOperacion {

    public ServidorLibros() throws RemoteException {
        super();
    }
@Override
    public Libro Operacion(Libro libro, Accion accion) throws RemoteException {
        switch (accion)
        {
            case crear:
                
                break;
                case editar:
                
                break;
                case eliminar:
                
                break;
        }
            
        return libro;
    }
  
    
    public static void main(String[] args) {
       ServidorLibros servidor;  
      try {
	    LocateRegistry.createRegistry(1099); // registrar el servidor e rmi register
	    servidor=new ServidorLibros(); 
	    Naming.bind("Operacion", servidor); 
            System.out.println("El servidor esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
    }

    
}
