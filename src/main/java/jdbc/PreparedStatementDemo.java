package main.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementDemo {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/darush?useSSL=false", "root", "123mysql");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO emp VALUES (?,?,?)");
            preparedStatement.setInt(1, 101);
            preparedStatement.setString(2, "Farid");
            preparedStatement.setInt(3, 27);
            int i = preparedStatement.executeUpdate();
            System.out.println(i + " record(s) inserted.");

            preparedStatement = connection.prepareStatement("UPDATE emp SET name=? WHERE id=?");
            preparedStatement.setString(1, "NewUser");
            preparedStatement.setInt(2, 101);
            i = preparedStatement.executeUpdate();
            System.out.println(i + " record(s) updated.");

            preparedStatement = connection.prepareStatement("delete from emp where id=?");
            preparedStatement.setInt(1, 101);
            i = preparedStatement.executeUpdate();
            System.out.println(i + " record(s) deleted");

            preparedStatement = connection.prepareStatement("SELECT * FROM emp");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));
            }

            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
