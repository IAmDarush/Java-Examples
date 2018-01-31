package example2;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BankImpl extends UnicastRemoteObject implements Bank {


    protected BankImpl() throws RemoteException {}

    @Override
    public List<Customer> getCustomers() throws RemoteException {
        List<Customer> list = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers?useSSL=false", "root", "123mysql");
            PreparedStatement statement = connection.prepareStatement("select * from darush");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Customer customer = new Customer();
                customer.setAcc_no(resultSet.getInt(1));
                customer.setFirstName(resultSet.getString(2));
                customer.setLastName(resultSet.getString(3));
                customer.setEmail(resultSet.getString(4));
                customer.setAmount(resultSet.getFloat(5));
                list.add(customer);
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
