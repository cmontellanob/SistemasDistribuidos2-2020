/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Carlos
 */
public interface IOperaciones extends Remote{
    int sumatoria(int n) throws RemoteException; 
    int factorial(int n) throws RemoteException;
    String invertircadena(String cadena) throws RemoteException;
}
