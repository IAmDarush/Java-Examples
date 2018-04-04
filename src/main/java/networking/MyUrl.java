import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class MyUrl {
    public static void main(String[] args){
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());

            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();

            int i;
            while((i = inputStream.read()) != -1){
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}