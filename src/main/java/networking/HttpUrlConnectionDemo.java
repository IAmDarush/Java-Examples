import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Lenovo Desktop on 11/30/2017.
 */
public class HttpUrlConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            for (int i=0; i<=9; i++){
                System.out.println(httpURLConnection.getHeaderFieldKey(i) + "=" + httpURLConnection.getHeaderField(i));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
