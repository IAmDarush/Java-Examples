import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * java -cp lib/mysql-connector-java-5.1.45.jar;
 */
public class TransactionManagementDemo {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/darush?useSSL=false",
                "root",
                "123mysql"
        );
        connection.setAutoCommit(false);

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO emp VALUE (?,?,?)");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Enter id:");
            int id = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Enter name:");
            String name = bufferedReader.readLine();

            System.out.println("Enter age:");
            int age = Integer.parseInt(bufferedReader.readLine());

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, age);
            preparedStatement.executeUpdate();

            System.out.println("commit or rollback?");
            String answer = bufferedReader.readLine();
            if (answer.equals("commit")) {
                connection.commit();
            } else {
                connection.rollback();
            }

            System.out.println("Do you want to add more records y/n?");
            String yesNo = bufferedReader.readLine();
            if (yesNo.equals("n")) {
                break;
            }

        }

        connection.commit();
        System.out.println("Records successfully saved.");
        connection.close();

    }
}
