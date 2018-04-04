package main.java.io;

import java.io.FilePermission;
import java.security.PermissionCollection;

/**
 * Created by Darush on 1/12/2018.
 */
public class FilePermissionDemo {
    public static void main(String[] args) {
        String path = "D:\\IO Package\\test.txt"; // A test or sample path
        // Grand read access to all files and subdirectories
        FilePermission filePermission1 = new FilePermission("D:\\IO Package\\-", "Read");
        PermissionCollection permissionCollection = filePermission1.newPermissionCollection();
        permissionCollection.add(filePermission1);

        FilePermission filePermission2 = new FilePermission(path, "write");
        permissionCollection.add(filePermission2);

        if (permissionCollection.implies(new FilePermission(path, "read,write"))) {
            System.out.println("Read, Write permission is granted for the path " + path);
        } else {
            System.out.println("No Read, Write permission is granted for the path " + path);
        }
    }
}
