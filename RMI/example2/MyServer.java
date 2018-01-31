package example2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class MyServer {

    public static void main(String[] args) {

        try {
            Remote remote = new BankImpl();
            Naming.rebind("rmi://localhost:6666/darush", remote);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }

    }

}
