import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallPrivateMethodDemo {

    public static void main(String[] args) {

        try {

            Class c = Class.forName("A");
            Object object = c.newInstance();
            Method message = c.getDeclaredMethod("message", (Class[]) null);
            message.setAccessible(true);
            message.invoke(object, null);

            Method message2 = c.getDeclaredMethod("message", String.class);
            message2.setAccessible(true);
            message2.invoke(object, "Darush");

        } catch (ClassNotFoundException |
                IllegalAccessException |
                InstantiationException |
                NoSuchMethodException |
                InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}

