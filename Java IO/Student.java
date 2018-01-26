import java.io.Serializable;

/**
 * Created by Darush on 1/26/2018.
 */
public class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
