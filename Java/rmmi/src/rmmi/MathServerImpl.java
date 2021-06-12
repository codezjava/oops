package rmmi;
import java.rmi.*;
import java.rmi.server.*;

public class MathServerImpl extends UnicastRemoteObject implements MathServerIntf {

    public MathServerImpl() throws RemoteException {
    }

    public int add(int a, int b) throws RemoteException {
        return a+b;
    }

    public int subtract(int a, int b) throws RemoteException {
        return a-b;
    }

    public int multiply(int a, int b) throws RemoteException {
        return a*b;
    }

    public int divide(int a, int b) throws RemoteException {
        if(b==0) {
            return -1;
        } else {
            return a/b;
        }
    }
}
