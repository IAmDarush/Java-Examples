import java.io.IOException;

public class ThrowsDemo {

    void m() throws IOException {
        throw new IOException("device error");
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();
        obj.p();
        System.out.println("Normal flow...");
    }

}
