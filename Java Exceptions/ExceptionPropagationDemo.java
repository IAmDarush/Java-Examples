public class ExceptionPropagationDemo {

    void m() {
        int data = 25/0;
    }

    void n() {
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

        ExceptionPropagationDemo obj = new ExceptionPropagationDemo();
        obj.p();
        System.out.println("Normal flow...");

    }

}
