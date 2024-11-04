package Tasks_from_seminar.Task_1;

import java.util.Random;

/*
Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
*/
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        System.out.println("Min - " + findMin(array));
        System.out.println("Max - " + findMax(array));
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
