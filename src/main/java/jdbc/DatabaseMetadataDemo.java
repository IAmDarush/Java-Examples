package main.java.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Created by Lenovo Desktop on 12/11/2017.
 */
public class DatabaseMetadataDemo {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/darush?useSSL=false",
                    "root",
                    "123mysql");

            DatabaseMetaData dbMetaData = connection.getMetaData();

            System.out.println("Driver Name: " + dbMetaData.getDriverName());
            System.out.println("Driver Version: " + dbMetaData.getDriverVersion());
            System.out.println("User Name: " + dbMetaData.getUserName());
            System.out.println("Databse Product Name: " + dbMetaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + dbMetaData.getDatabaseProductVersion());

            // print all the available tables
            String table[] = {"TABLE"};
            ResultSet resultSet = dbMetaData.getTables(null, null,null, table);
            while (resultSet.next()) {
                System.out.println("Table Name: " + resultSet.getString(3));
            }

            // print all the available views
            String table1[] = {"VIEW"};
            ResultSet resultSet1 = dbMetaData.getTables(null, null, null, table1);
            while (resultSet1.next()) {
                System.out.println("View: " + resultSet1.getString(3));
            }

            connection.close();

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
