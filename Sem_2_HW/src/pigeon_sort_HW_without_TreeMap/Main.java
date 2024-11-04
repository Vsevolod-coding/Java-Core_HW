package pigeon_sort_HW_without_TreeMap;

import java.util.Arrays;

/*
– Написать метод, осуществляющий сортировку одномерного массива подсчётом.
Важное ограничение состоит в том, что для этой сортировки диапазон значений
исходного массива должен находиться в разумных пределах, например, не более 1000.
*/
public class Main {
    public static void main(String[] args) {
//        Random random = new Random();

        int[] array = {3,2,1,0};

//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(20);
//        }

        System.out.println("Изначальный массив:");
        System.out.println(Arrays.toString(array));

        pigeonSort(array);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }

    private static void pigeonSort(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        int range = max - min + 1;

        int[] holes = new int[range];
        for (int num : array) {
            holes[num - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (holes[i] > 0) {
                array[index++] = i + min;
                holes[i]--;
            }
        }
    }
}