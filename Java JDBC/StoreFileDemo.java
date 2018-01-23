import java.io.*;
import java.sql.*;

/**
 * Created by Lenovo Desktop on 12/23/2017.
 */
public class StoreFileDemo {
    public static void main(String[] args){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/darush?useSSL=false",
                    "root",
                    "123mysql"
            );

            // Store the file
            String query = "INSERT INTO filetable (id, name) VALUES (?, ?)"; // SQL query
            PreparedStatement preparedStatement = connection.prepareStatement(query); // prepare the sql statement
            File file = new File("sample.js"); // get the file path
            FileReader reader = new FileReader(file); // Start a file reader to read the data in the file
            preparedStatement.setInt(1, 1); // set the first parameter of sql statement
            preparedStatement.setCharacterStream(2, reader); // set the second parameter of the sql statement
            int result = preparedStatement.executeUpdate(); // execute the update
            System.out.println(result + " records updated.");


            // Retrieve the file
            preparedStatement = connection.prepareStatement("SELECT * FROM filetable");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Clob clob = resultSet.getClob(2);
            Reader reader1 = clob.getCharacterStream();
            FileWriter fileWriter = new FileWriter("sample_copy.js");
            int i;
            while ((i=reader1.read()) != -1){
                fileWriter.write((char)i);
            }
            fileWriter.close();

            connection.close();

            System.out.println("Success!!!");

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
