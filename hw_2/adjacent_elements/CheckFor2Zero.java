package adjacent_elements;
// Написать функцию, возвращающую истину, если в переданном массиве есть два
// соседних элемента, с нулевым значением.
public class CheckFor2Zero {
    public static boolean hasAdjacentZeros(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == 0 && a[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasAdjacentZeros(new int[]{0,2,3,4,1,0}));
    }
}
