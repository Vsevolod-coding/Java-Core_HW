package pigeon_sort;

/*
– Написать метод, осуществляющий сортировку одномерного массива подсчётом.
Важное ограничение состоит в том, что для этой сортировки диапазон значений
исходного массива должен находиться в разумных пределах, например, не более 1000.
*/

import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(pigeonSort(array)));
    }

    private static int[] pigeonSort(int[] array) {
        int[] newArray = new int[array.length];
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        int i = 0;

        for (Integer key : map.keySet()) {
            for (int j = 0; j < map.get(key); j++) {
                newArray[i++] = key;
            }
        }
        return newArray;
    }
}
