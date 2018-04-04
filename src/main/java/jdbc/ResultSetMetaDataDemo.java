package main.java.jdbc;

import java.sql.*;

/**
 * Created by Lenovo Desktop on 12/9/2017.
 */
public class ResultSetMetaDataDemo {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/darush?useSSL=false",
                    "root",
                    "123mysql");
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM emp");
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            System.out.println("Total columns: " + resultSetMetaData.getColumnCount());
            System.out.println("Column Name of 1st column: " + resultSetMetaData.getColumnName(1));
            System.out.println("Column Type Name of 1th column: " + resultSetMetaData.getColumnTypeName(1));

            connection.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
