public class MemberInnerClassDemo {

    private int data = 40;

    class MemberInnerClass {
        void msg() {
            System.out.println("data is = " + data);
        }
    }

    public static void main(String[] args) {

        MemberInnerClassDemo outerObject = new MemberInnerClassDemo();
        MemberInnerClass innerObject = outerObject.new MemberInnerClass();
        innerObject.msg();

    }

}