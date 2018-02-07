/**
 * Created by Darush on 2/7/2018.
 */
public class MultiCatchDemo {

    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[5] = 30/0;
        } catch (ArithmeticException e) {
            // Only this block will be executed
            System.out.println("Arithmetic exception occurred");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of index");
        } catch (Exception e) {
            System.out.println("An Exception occurred");
        }

        System.out.println("Rest of the code...");

    }

}
