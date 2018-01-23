import java.io.*;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args){
        try{
            Socket socket = new Socket("localhost", 6666);

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String str1 = "";
            String str2 = "";
            while(!str1.equals("stop")) {
                str1 = bufferedReader.readLine();
                dataOutputStream.writeUTF(str1);
                dataOutputStream.flush();

                str2 = dataInputStream.readUTF();
                System.out.println("Server says: " + str2);
            }

            dataOutputStream.close();
            socket.close();
        } catch (IOException e){
            System.out.println(e);
        }
    }
}