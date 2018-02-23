import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallPrivateMethodDemo {

    public static void main(String[] args) {

        try {

            Class c = Class.forName("A");
            Object object = c.newInstance();
            Method method = c.getDeclaredMethod("message", (Class[]) null);
            method.setAccessible(true);
            method.invoke(object, null);

        } catch (ClassNotFoundException |
                IllegalAccessException |
                InstantiationException |
                NoSuchMethodException |
                InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}

