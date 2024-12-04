package seminar_tasks;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Task2Add {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(readData("test.txt")));
    }

    public static int[] readData(String path) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        try (FileReader fileReader = new FileReader(path)) {
            int n;
            boolean flag = true;

            while((n=fileReader.read()) != -1) {
                char temp = (char) n;
                if (temp == '0' && flag) {
                    flag = false;
                } else {
                    flag = true;
                    arrayList.add(Integer.parseInt(String.valueOf(temp)));
                }
            }

            int[] res = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                res[i] = arrayList.get(i);
            }
            return res;
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return null;
    }
}
