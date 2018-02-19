public class GetClassDemo {

    void printName(Object obj) {
        Class c = obj.getClass();
        System.out.println(c.getName());
    }

    public static void main(String[] args) {

        Sample sample = new Sample();

        GetClassDemo demo = new GetClassDemo();
        demo.printName(sample);

    }

}
