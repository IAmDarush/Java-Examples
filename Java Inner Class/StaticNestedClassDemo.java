public class StaticNestedClassDemo {

    static int data = 40;

    static class Inner {

        void msg() {
            System.out.println("Data = " + data);
        }

    }

    public static void main(String[] args) {

        StaticNestedClassDemo.Inner inner = new StaticNestedClassDemo.Inner();
        inner.msg();

    }

}
