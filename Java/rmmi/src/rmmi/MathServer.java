package rmmi;

import java.rmi.*;
import java.rmi.server.*;

public class MathServer {

    public static void main(String[] args) {
        try {
            MathServerImpl mathServerImpl = new MathServerImpl();
            Naming.rebind("MathServer", mathServerImpl);
        } catch(Exception exp) {
            exp.printStackTrace();
        }
    }
}
