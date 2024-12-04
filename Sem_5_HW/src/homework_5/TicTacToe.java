package homework_5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TicTacToe {
    public static void main(String[] args) {
        int[] field = {0, 1, 2, 3, 1, 2, 0, 3, 1}; // Пример поля (9 элементов)

        try {
            writeFieldToFile(field, "ticTacToe.dat");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static void writeFieldToFile(int[] field, String fileName) throws IOException {
        if (field.length != 9) {
            throw new IllegalArgumentException("Массив должен содержать 9 элементов.");
        }

        // Создаем переменную для хранения 18 бит
        int combinedBits = 0;

        // Кодируем 9 значений в 18 бит
        for (int i = 0; i < 9; i++) {
            if (field[i] < 0 || field[i] > 3) {
                throw new IllegalArgumentException("Каждое значение должно быть в диапазоне [0, 3].");
            }
            combinedBits |= (field[i] << (2 * i));  // Сдвигаем на 2 бита в зависимости от индекса
        }

        // Открываем поток для записи в файл
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            // Записываем три байта (24 бита)
            dos.writeByte((combinedBits >> 16) & 0xFF);  // Первый байт (старшие 8 бит)
            dos.writeByte((combinedBits >> 8) & 0xFF);   // Второй байт
            dos.writeByte(combinedBits & 0xFF);          // Третий байт (младшие 8 бит)
            System.out.println("Поле было успешно записано в файл.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
