package main.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

/**
 * Created by Lenovo Desktop on 12/26/2017.
 */
public class CallableStatementDemo {

    public static void main(String[] args) throws Exception{

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/darush?useSSL=false",
                "root",
                "123mysql"
        );


        /*CREATE PROCEDURE insert_row (IN id INT, IN name VARCHAR(20), IN age INT)
        BEGIN
        INSERT INTO emp VALUES(id, name, age);
        END //*/

        // Insert a row of employee using this Stored Procedure
        CallableStatement statement = connection.prepareCall("{CALL insert_row(?,?,?)}");
        statement.setInt(1, 223);
        statement.setString(2, "Darius");
        statement.setInt(3, 29);
        statement.execute();
        System.out.println("Success");

        /*CREATE FUNCTION sum4(num1 INT, num2 INT) RETURNS INT
        BEGIN
        DECLARE temp int(8);
        SET temp=num1+num2;
        RETURN temp;
        END//*/

        // Get the sum of two numbers from this Store Function
        statement = connection.prepareCall("{?= call sum4(?,?)}");
        statement.setInt(2, 20);
        statement.setInt(3, 30);
        statement.registerOutParameter(1, Types.INTEGER); // Set the first parameter as the output of the result
        statement.execute(); // Execute the statement
        System.out.println(statement.getInt(1));
        connection.close();

    }

}
