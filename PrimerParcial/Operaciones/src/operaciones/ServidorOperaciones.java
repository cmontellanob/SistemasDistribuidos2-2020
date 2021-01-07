/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Carlos
 */
public class ServidorOperaciones extends UnicastRemoteObject
        implements IOperaciones {

    public ServidorOperaciones() throws RemoteException {
        super();
    }

    @Override
    public int sumatoria(int n) throws RemoteException {
        int aux=0;
        for (int i=0;i<=n;i++)
        {
            aux+=i;
        }
        return aux;
    }    
    public int factorial(int n) throws RemoteException {
        int aux=1;
        for (int i=1;i<=n;i++)
        {
            aux*=i;
        }
        return aux;
    }

    @Override
    public String invertircadena(String cadena) throws RemoteException {
      StringBuilder builder=new StringBuilder(cadena);
        return builder.reverse().toString();
    }
    
      public static void main(String[] args) {
       ServidorOperaciones servidor;  
      try {
	    LocateRegistry.createRegistry(1099); // registrar el servidor e rmi register
	    servidor=new ServidorOperaciones(); 
	    Naming.bind("Operaciones", servidor); 
            System.out.println("El servidor esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
    }


}
