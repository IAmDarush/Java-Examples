package main.java.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by Lenovo Desktop on 12/9/2017.
 */
public class PreparedStatementDemoUserInput {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/darush?useSSL=false",
                    "root",
                    "123mysql");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO emp VALUE(?,?,?)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            while(true){
                System.out.println("Enter id: ");
                int id = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Enter name: ");
                String name = bufferedReader.readLine();
                System.out.println("Enter age: ");
                int age = Integer.parseInt(bufferedReader.readLine());

                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, name);
                preparedStatement.setInt(3, age);
                int i = preparedStatement.executeUpdate();
                System.out.println(i + " records updated.");

                System.out.println("Do you want to continue? y/n");

                String answer = bufferedReader.readLine();
                if (answer.startsWith("n")) {
                    break;
                }
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
