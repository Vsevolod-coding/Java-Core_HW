package seminar_tasks;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Написать программу заменяющую указанный символ в текстовом
// файле на пробел, сохраняющую получившийся текст в новый файл.

public class Task3 {
    public static final String PATH_TO_FILE = "test_3.txt";
    public static void main(String[] args) {
        write("Today was a good day!");
        String modifiedContent = replaceWord(read(PATH_TO_FILE), "good", "great");
        write(modifiedContent);
        System.out.println(read(PATH_TO_FILE));
    }

    public static void write(String string) {
        try (FileWriter writer = new FileWriter(PATH_TO_FILE)) {
            writer.write(string);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String read(String path) {
        try (FileReader fileReader = new FileReader(path)) {
            StringBuilder stringBuilder = new StringBuilder();
            int character;
            while ((character = fileReader.read()) != -1) {
                stringBuilder.append((char) character);
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String replaceChar(String content, char ch) {
        return content.replace(ch, ' ');
    }


    public static String replaceWord(String content, String wordToReplace, String replacement) {
        return content.replace(wordToReplace, replacement);
    }
}
