package seminar_tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

// Создать массив из 9 цифр и записать его в файл, используя поток вывода.

public class Task1 {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5,6,7,8,9};
        write(testArray);
    }

    public static void write(int[] arr) {
        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write(Arrays.toString(arr));
            System.out.println("All is good");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
