package main.java.rmi.example2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class MyClient {

    public static void main(String[] args) {

        try {
            Bank bank = (Bank) Naming.lookup("rmi://localhost:6666/darush");

            List<Customer> list = bank.getCustomers();

            for(Customer customer : list) {
                System.out.println(
                        customer.getAcc_no() + " "
                        + customer.getFirstName() + " "
                        + customer.getLastName() + " "
                        + customer.getEmail() + " "
                        + customer.getAmount()
                );
            }
        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }

    }

}
