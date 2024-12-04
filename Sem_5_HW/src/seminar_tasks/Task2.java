package seminar_tasks;
// Создать массив целых чисел и заполнить его информацией из
// файла, записанного в предыдущем задании.

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        int[] testArray = {1,2,3,4,5,6,7,8,9};
        replaceAndWrite(testArray);
    }

    public static void write(String string) {
        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write(string);
            System.out.println("All is good");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void replaceAndWrite(int[] arr) {
        StringBuilder res = new StringBuilder();
        for (int el: arr) {
            res.append(el).append("0");
        }
        res.deleteCharAt(res.length()-1);
        write(res.toString());
    }
}
