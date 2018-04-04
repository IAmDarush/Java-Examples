package main.java.reflection;

interface SampleInterface {
}

public class DetermineClassObjectDemo {

    public static void main(String[] args) {

        try {
            Class sample = Class.forName("Sample");
            System.out.println(sample.getName() + " is interface: " + sample.isInterface());


            Class sampleInterface = Class.forName("SampleInterface");
            System.out.println(sampleInterface.getName() + " is interface: "
                    + sampleInterface.isInterface());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
