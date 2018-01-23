import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args){
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String str1 = "";
            String str2 = "";

            while (!str1.equals("stop")) {
                str1 = dataInputStream.readUTF();
                System.out.println("Client says: " + str1);

                str2 = bufferedReader.readLine();

                dataOutputStream.writeUTF(str2);
                dataOutputStream.flush();
            }

            dataInputStream.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}