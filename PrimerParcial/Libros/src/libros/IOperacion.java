/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libros;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Carlos
 */
public interface IOperacion extends Remote {
    
    Libro Operacion(Libro libro, Accion accion) throws RemoteException;
    
}
