package main.java.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by Lenovo Desktop on 12/11/2017.
 */
public class StoreImageDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/darush?useSSL=false",
                    "root",
                    "123mysql");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO imgtable VALUES (?,?)");
            preparedStatement.setString(1, "darush");

            FileInputStream fileInputStream = new FileInputStream("darush.jpg");
            preparedStatement.setBinaryStream(2, fileInputStream, fileInputStream.available());

            int i = preparedStatement.executeUpdate();
            System.out.println(i + " records affected");

            connection.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
