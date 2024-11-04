package Tasks_from_seminar.Task_2;

/*
Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
заполнить его диагональные элементы единицами, используя цикл(ы)
 */

public class Main {
    public static void main(String[] args) {
        RectangleArray array = new RectangleArray(9);
        array.fillDiagonalWithNum();
        System.out.println(array);
    }
}