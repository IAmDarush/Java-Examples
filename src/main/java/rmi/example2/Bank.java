package main.java.rmi.example2;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface Bank extends Remote {
    List<Customer> getCustomers() throws RemoteException;
}