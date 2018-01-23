import java.sql.*;


/** java -cp lib/mysql-connector.jar; MysqlConnectionDemo
 * java -cp lib/mysql-connector-java-5.1.45.jar; MysqlConnectionDemo
 * set classpath="C:\Users\Lenovo Desktop\Desktop\test\Java JDBC\mysql-connector-java-5.1.45.jar;.;"
 **/
public class MysqlConnectionDemo {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/darush?useSSL=false", "root", "123mysql");
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            // Select all the data
            ResultSet resultSet = statement.executeQuery("SELECT * FROM emp");
            while(resultSet.next()){
                System.out.println(
                        resultSet.getInt(1) + " " +
                        resultSet.getString(2) + " " +
                        resultSet.getString(3)
                );
            }

            // Insert a new record
            int result = statement.executeUpdate("INSERT INTO emp VALUES (33, 'John', 40),(34, 'Mike', 23)");
            System.out.println(result);

            // Delete the specified record
            result = statement.executeUpdate("DELETE FROM emp WHERE id=33");
            System.out.println(result);

            // Select a specific row
            resultSet = statement.executeQuery("SELECT * FROM emp");
            resultSet.absolute(2);
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getInt(3));

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
