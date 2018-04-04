package main.java.reflection;

class Sample {
}

public class ForNameDemo {

    public static void main(String[] args) {

        try {

            Class sample = Class.forName("Sample");
            System.out.println(sample.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
