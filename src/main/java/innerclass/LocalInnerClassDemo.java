package main.java.innerclass;

public class LocalInnerClassDemo {

    private int data = 20;


    void display() {
        class Local {
            int localVariable = 50;

            void msg(){
                System.out.println(data + localVariable);
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
