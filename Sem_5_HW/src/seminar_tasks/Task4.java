package seminar_tasks;

import java.io.File;

// Написать программу, читающую и выводящую в содержимое
// текущей папки .
public class Task4 {
    public static void main(String[] args) {
        printDirectoryContents(new File("."), 0);
    }

    public static void printDirectoryContents(File dir, int lvl) {
        // Отступы для вложенности
        String indent = " ".repeat(lvl * 2);

        // Вывод имени текущей директории
        System.out.println(indent + "[DIR] " + dir.getName());

        File[] files = dir.listFiles(); // Получение списка файлов и папок
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // Рекурсивный вызов для вложенных директорий
                    printDirectoryContents(file, lvl + 1);
                } else {
                    // Вывод имени файла
                    System.out.println(indent + "  [FILE] " + file.getName());
                }
            }
        }
    }
}
