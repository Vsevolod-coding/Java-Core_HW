package seminar_tasks;
// Написать функцию, добавляющую префикс к каждому из набора
// файлов, названия которых переданы ей в качестве параметров через
// пробел.

import java.io.File;

public class Task5 {
    public static void main(String[] args) {
        String prefix = "777_";
        String[] fileNames = {"test-1.txt","test-2.txt","test-3.txt"};

        addPrefixToFiles(prefix, fileNames);
    }

    public static void addPrefixToFiles(String prefix, String[] fileNames) {
        for (String fileName : fileNames) {
            File file = new File(fileName);
            if (file.exists() && file.isFile()) {
                String newFileName = prefix + fileName;
                File renamedFile = new File(newFileName);

                if (file.renameTo(renamedFile)) {
                    System.out.println("File " + fileName + " renamed to " + newFileName);
                } else {
                    System.out.println("An error occurred while renaming the file.");
                }
            } else {
                System.out.println("File " + fileName + " does not exist or it is not a file.");
            }
        }
    }
}
