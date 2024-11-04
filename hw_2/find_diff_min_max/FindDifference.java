package find_diff_min_max;
// Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного
// не пустого массива.
public class FindDifference {
   public static int diffMinMax(int[] a) {
       int min = a[0];
       int max = a[0];

       for (int i = 1; i < a.length; i++) {
           if (a[i] < min) {
               min = a[i];
           }
           if (a[i] > max) {
               max = a[i];
           }
       }
       return max - min;
   }

    public static void main(String[] args) {
        System.out.println(diffMinMax(new int[]{1,2,3,4,5,6,78,100,8,786,324}));
    }
}
