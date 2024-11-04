package count_evens;
//Написать метод, возвращающий количество чётных элементов массива.
public class CountEvens {
    public static int countEvens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{1,2,3,4,5,6,7,8,9,9,9,9,2}));
    }
}
