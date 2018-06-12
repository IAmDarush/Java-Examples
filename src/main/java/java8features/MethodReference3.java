package main.java.java8features;

interface Playable{
    void play();
}

public class MethodReference3 {

    public void playSomething() {
        System.out.println("I am playing something....");
    }

    public static void main(String[] args) {

        MethodReference3 methodReference3 = new MethodReference3();
        Playable playable = methodReference3::playSomething;
        playable.play();

        // Using anonymous object
        Playable playable1 = new MethodReference3()::playSomething;
        playable1.play();


    }

}
