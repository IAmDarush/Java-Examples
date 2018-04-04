package main.java.jdbc;

import java.io.FileOutputStream;
import java.sql.*;

/**
 * Created by Lenovo Desktop on 12/12/2017.
 */
public class RetrieveImageDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/darush?useSSL=false",
                    "root",
                    "123mysql");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM imgtable");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Blob blob = resultSet.getBlob(2);
                byte byteArray[] = blob.getBytes(1, (int) blob.length());
                FileOutputStream fileOutputStream = new FileOutputStream("myImage.jpg");
                fileOutputStream.write(byteArray);
                fileOutputStream.close();
            }

            System.out.println("Done");
            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
