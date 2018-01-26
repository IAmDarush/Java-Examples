import java.io.Serializable;

/**
 * Created by Darush on 1/26/2018.
 */
public class Student implements Serializable {
    int id;
    String name;
    transient int age; // It will not be serialized

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
