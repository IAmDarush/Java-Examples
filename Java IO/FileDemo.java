import com.sun.javafx.binding.StringFormatter;

import java.io.File;
import java.text.DecimalFormat;

/**
 * Created by Darush on 1/23/2018.
 */
public class FileDemo {
    public static void main(String[] args) {
        try {

            // Given the file path, create a new file if it doesn't exist already
            File file = new File("files/newFile.txt");
            if(file.createNewFile()) {
                System.out.println("New File is created : " + file);
            } else {
                System.out.println(file + "  already exists.");
            }

            // Get the canonical path
            File canonicalFile = file.getCanonicalFile();
            System.out.println("Canonical File: " + canonicalFile);
            System.out.println("Canonical File Name : " + canonicalFile.getName());
            System.out.println("Canonical File Parent : " + canonicalFile.getParent());
            System.out.println("Canonical File Parent File: " + canonicalFile.getParentFile());
            System.out.println("Canonical File Path : " + canonicalFile.getPath());
            System.out.println("Canonical File Absolute Path : " + canonicalFile.getAbsolutePath());
            System.out.println("Canonical File Exists : " + canonicalFile.exists());
            DecimalFormat decimalFormat = new DecimalFormat("#");
            decimalFormat.setGroupingUsed(true);
            decimalFormat.setGroupingSize(3);
            System.out.println("Canonical File Total Space: " + decimalFormat.format(canonicalFile.getTotalSpace()/1024/1024) + " MB");
            System.out.println("Canonical File Free Space: " + decimalFormat.format(canonicalFile.getFreeSpace()/1024/1024) + " MB");

            // Get list of files and directories in a specific folder/path
            File files = new File("files");
            String fileNames[] = files.list();
            System.out.println("List of files and directories in path /files/");
            for (String fileName : fileNames) {
                System.out.println(fileName);
            }

            // Get each file in the files/ path as a File object in order to check
            // each file's status
            File fileList[] = files.listFiles();
            for(File f: fileList) {
                System.out.println(f.getName() + " can write: " + f.canWrite()
                    + " Is Hidden: " + f.isHidden() + " Length: " + f.length() + " bytes");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
