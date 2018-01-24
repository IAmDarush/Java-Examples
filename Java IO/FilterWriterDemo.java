import java.io.*;

/**
 * Created by Darush on 1/24/2018.
 */

class MyFilterWriter extends FilterWriter {

    /**
     * Create a new filtered writer.
     *
     * @param out a Writer object to provide the underlying stream.
     * @throws NullPointerException if <code>out</code> is <code>null</code>
     */
    protected MyFilterWriter(Writer out) {
        super(out);
    }

    @Override
    public void write(String str) throws IOException {
        super.write(str.toLowerCase());
    }
}

public class FilterWriterDemo {

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("files/test.txt");
            MyFilterWriter filterWriter = new MyFilterWriter(fileWriter);
            filterWriter.write("Filter Writer Example.");
            filterWriter.close();

            FileReader fileReader = new FileReader("files/test.txt");
            BufferedReader buffer = new BufferedReader(fileReader);

            int i;
            while((i= buffer.read()) != -1) {
                System.out.print((char) i);
            }

            buffer.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
