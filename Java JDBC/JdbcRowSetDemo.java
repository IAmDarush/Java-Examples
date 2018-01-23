import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

/**
 * Created by Darush on 12/29/2017.
 */
public class JdbcRowSetDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        // Create the RowSet
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3306/darush?useSSL=false");
        rowSet.setUsername("root");
        rowSet.setPassword("123mysql");
        rowSet.setCommand("Select * from emp");
        rowSet.execute();
        // Add a listener for rowSet
        rowSet.addRowSetListener(new MyRowSetListener());

        while (rowSet.next()) {
            System.out.println("Id: " + rowSet.getString(1));
            System.out.println("Name: " + rowSet.getString(2));
            System.out.println("Age: " + rowSet.getInt(3));
        }
    }
}

class MyRowSetListener implements RowSetListener {

    @Override
    public void rowSetChanged(RowSetEvent event) {
        System.out.println("RowSet changed...");
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        System.out.println("Row changed...");
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        System.out.println("Cursor moved...");
    }
}
