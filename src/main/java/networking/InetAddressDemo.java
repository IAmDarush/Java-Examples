import java.net.InetAddress;

/**
 * Created by Lenovo Desktop on 11/30/2017.
 */
public class InetAddressDemo {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("www.javatpoint.com");

            System.out.println("Host Name: " + inetAddress.getHostName());
            System.out.println("IP Address: " + inetAddress.getHostAddress());

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
