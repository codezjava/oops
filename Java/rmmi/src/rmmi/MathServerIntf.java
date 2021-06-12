package rmmi;


import java.rmi.*;
import java.rmi.server.*;

public interface MathServerIntf extends Remote {    

    public int add(int a, int b) throws RemoteException;

    public int subtract(int a, int b) throws RemoteException;

    public int multiply(int a, int b) throws RemoteException;

    public int divide(int a, int b) throws RemoteException;
}


