package Tasks_from_seminar.Task_4;

import java.util.Arrays;

/*
Написать функцию добавления элемента в конец массива таким образом, чтобы
она расширяла массив при необходимости.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        System.out.println(Arrays.toString(addToEnd(arr, 3)));
        System.out.println(Arrays.toString(addToIndex(arr, 100, 0)));
    }

    private static int[] addToEnd(int[] arr, int el) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, newArr.length - 1);
        newArr[newArr.length - 1] = el;
        return newArr;
    }

    private static int[] addToIndex(int[] arr, int el, int index) {
        if (index > arr.length || index < arr.length) {
            throw new IllegalArgumentException("Индекс за пределами массива");
        }

        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, index);

        newArr[index] = el;

        if (newArr.length - 1 - index >= 0) {
            System.arraycopy(arr, index, newArr, index + 1, newArr.length - 1 - index);
        }
        return newArr;
    }
}
