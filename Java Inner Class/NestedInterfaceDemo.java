interface Outer {
    void show();

    interface Inner {
        void msg();
    }
}

public class NestedInterfaceDemo implements Outer.Inner{

    @Override
    public void msg() {
        System.out.println("This is the nested interface");
    }

    public static void main(String[] args) {

        Outer.Inner obj = new NestedInterfaceDemo(); // Upcasting
        obj.msg();

    }
}
