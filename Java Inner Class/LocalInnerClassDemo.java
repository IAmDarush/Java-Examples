public class LocalInnerClassDemo {

    private int data = 20;


    void display() {
        class Local {
            void msg(){
                System.out.println(data);
            }
        }

        Local local = new Local();
        local.msg();
    }

    public static void main(String[] args) {

        LocalInnerClassDemo obj = new LocalInnerClassDemo();
        obj.display();

    }

}
