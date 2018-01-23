import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramReceiver {
    public static void main(String[] args){
        try{
            DatagramSocket datagramSocket = new DatagramSocket(3000);
            byte[] buf = new byte[1024];

            DatagramPacket datagramPacket = new DatagramPacket(buf, 1024);
            datagramSocket.receive(datagramPacket);

            String str = new String(datagramPacket.getData(), 0, datagramPacket.getLength());

            System.out.println(str);

            datagramSocket.close();

        } catch (IOException e){
            System.out.println(e);
        }

    }
}
