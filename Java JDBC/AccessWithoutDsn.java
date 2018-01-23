import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * java -cp lib/mysql-connector-java-5.1.45.jar; AccessWithoutDsn
 */
public class AccessWithoutDsn {
    public static void main(String[] args){
        try {
            String database = "student.mdb";
            String url = "jdbc:odbc:Driver={Microsoft Access Driver(*.mdb)};" +
                    "DBQ=" + database + ";DriverID=22;READONLY=true";
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM login");

            while(resultSet.next()){
                System.out.println(resultSet.getString(1));
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
