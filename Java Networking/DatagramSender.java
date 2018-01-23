import java.io.IOException;
import java.net.*;

final class DatagramSender {
    public static void main(String[] args){
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            String str = "Welcome java";
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");

            DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), str.length(), inetAddress, 3000);
            datagramSocket.send(datagramPacket);
            datagramSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
