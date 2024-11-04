package Tasks_from_seminar.Task_3;
/*
– Написать метод, в который передается не пустой одномерный целочисленный
массив, метод должен вернуть true если в массиве есть место, в котором сумма
левой и правой части массива равны. Примеры:
checkBalance([1, 1, 1, || 2, 1]) → true,
checkBalance([2, 1, 1, 2, 1]) → false,
checkBalance([10, || 1, 2, 3, 4]) → true.
Абстрактная граница показана символами ||, эти символы в массив не входят.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(checkBalance3(new int[]{2,4,4,2, 2, 2, 4, 1, 1}));
    }

    private static boolean checkBalance(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым.");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int left = 0;
        for (int i = 0; i < array.length; i++) {
            left += array[i];
            sum -= array[i];
            if (left == sum) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkBalance3(int[] a) {
        int lbound = 0;
        int rbound = a.length - 1;
        int left = 0;
        int right = 0;
        while (lbound <= rbound) {
            if (left > right) {
                right += a[rbound--];
            } else {
                left += a[lbound++];
            }
        }
        return left == right;
    }

}
