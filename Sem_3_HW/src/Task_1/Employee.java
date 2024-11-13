package Task_1;/*
Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд,
без использования условного оператора.
*/

public class Employee {
    public int compareDates(int y1, int m1, int d1, int y2, int m2, int d2) {
        int date1 = (y1*10000) + (m1*100) + (d1);
        int date2 = (y2*10000) + (m2*100) + (d2);
        return Integer.compare(date1, date2);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        int result = employee.compareDates(2024,12,30,2020,7,15);
        System.out.println("result: " + result); // result: 1
        // -1, если первая дата меньше, 0, если они равны, 1, если первая дата больше.
    }
}
