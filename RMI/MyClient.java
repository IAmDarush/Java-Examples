import java.rmi.Naming;

public class MyClient {

    public static void main(String[] args) {

        try {

            Adder stub = (Adder) Naming.lookup("rmi://localhost:5000/darush");
            System.out.println(stub.add(45, 5));

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
