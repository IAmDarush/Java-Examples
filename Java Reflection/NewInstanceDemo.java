class Sample1 {
    void message(){
        System.out.println("Hello Java");
    }
}


public class NewInstanceDemo {

    public static void main(String[] args) {

        try {

            Class c = Class.forName("Sample1");
            Sample1 sample1 = (Sample1) c.newInstance();
            sample1.message();

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }

}
