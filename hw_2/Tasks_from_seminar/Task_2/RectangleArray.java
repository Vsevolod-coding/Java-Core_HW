package Tasks_from_seminar.Task_2;

public class RectangleArray {
    private final int[][] array;

    public RectangleArray(int size) {
        array = new int[size][size];
    }

    public void fillDiagonalWithNum() {
        int symbol = 1;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = symbol;
            array[i][array.length - i - 1] = symbol;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append("[");
            for (int j = 0; j < array[i].length; j++) {
                stringBuilder.append(array[i][j]);
                if (j < array[i].length - 1) {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("]").append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}
