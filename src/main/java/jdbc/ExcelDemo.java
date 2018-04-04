package main.java.jdbc;

import java.sql.*;

/**
 * Created by Lenovo Desktop on 12/28/2017.
 */
public class ExcelDemo {
    public static void main(String[] args) throws Exception{

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection connection = DriverManager.getConnection("jdbc:odbc:worcester");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from [Daily Data$]");
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int numOfCols = resultSetMetaData.getColumnCount();
        System.out.println("Number of columns = " + numOfCols);

        while (resultSet.next()) {
            for (int i=1; i<= numOfCols; i++) {
                if(i>1) System.out.println(", ");
                String colValue = resultSet.getString(i);
                System.out.println(colValue);
            }
            System.out.println("");
        }
        statement.close();
        connection.close();

    }
}
