import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

/**
 * Created by Darush on 1/8/2018.
 */
public class ByteArrayOutputStreamDemo {

    public static void main(String[] args) {

        try {
            FileOutputStream fout1 = new FileOutputStream("files/a.txt");
            FileOutputStream fout2 = new FileOutputStream("files/b.txt");

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(65);
            bout.writeTo(fout1);
            bout.writeTo(fout2);

            bout.flush();
            bout.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
