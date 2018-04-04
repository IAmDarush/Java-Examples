package main.java.exception;

public class UncheckedExceptionPropagation {

    void m() {
        //throw new java.io.IOException("Device error");
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

        UncheckedExceptionPropagation obj = new UncheckedExceptionPropagation();
        obj.p();
        System.out.println("Normal flow");

    }




}
