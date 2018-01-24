import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Darush on 1/24/2018.
 */

class MyFilterReader extends FilterReader {

    /**
     * Creates a new filtered reader.
     *
     * @param in a Reader object providing the underlying stream.
     * @throws NullPointerException if <code>in</code> is <code>null</code>
     */
    protected MyFilterReader(Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {

        int x = super.read();
        if((char) x == ' '){
            return ((int) '?');
        } else {
            return x;
        }
    }

}

public class FilterReaderDemo {

    public static void main(String[] args) {

        try {
            Reader reader = new FileReader("files/test.txt");
            MyFilterReader filterReader = new MyFilterReader(reader);

            int i;
            while((i = filterReader.read()) != -1) {
                System.out.print((char) i);
            }

            filterReader.close();
            reader.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
