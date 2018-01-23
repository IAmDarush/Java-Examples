import java.io.ByteArrayInputStream;
import java.io.PushbackInputStream;

/**
 * Created by Darush on 1/19/2018.
 */
public class PushBackInputStreamDemo {
    public static void main(String[] args) {
        try {
            String string = "1##2#34###12";
            byte bytes[] = string.getBytes();
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
            PushbackInputStream pushback = new PushbackInputStream(inputStream);

            int i;
            while((i = pushback.read()) != -1) {
                if(i == '#') {
                    int j;
                    if((j = pushback.read()) == '#') {
                        System.out.print("**");
                    } else {
                        pushback.unread(j); // push back one byte
                        System.out.print((char) i);
                    }
                } else {
                    System.out.print((char) i);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}
