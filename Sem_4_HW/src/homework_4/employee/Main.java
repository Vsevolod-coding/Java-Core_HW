package homework_4.employee;

import homework_4.Gender;
import homework_4.holiday.Holiday;
import homework_4.holiday.HolidayUtils;

public class Main {
    static Employee[] employees = {
            new Employee("Nik", 2000, Gender.MALE),
            new Employee("Mike", 4600, Gender.MALE),
            new Employee("George", 8000, Gender.MALE),
            new Employee("Alice", 3100, Gender.FEMALE)
    };


    public static void main(String[] args) {
        congratulateEmployees(employees);
    }

    public static void congratulateEmployees(Employee[] employees) {
        Holiday currentHoliday = HolidayUtils.getCurrentHoliday();

        for (Employee employee : employees) {
            switch (currentHoliday) {
                case NEW_YEAR:
                    System.out.println("С Новым Годом, " + employee.getName() + "!");
                    break;
                case WOMENS_DAY:
                    if (employee.getGender() == Gender.FEMALE) {
                        System.out.println("С 8 Марта, " + employee.getName() + "!");
                    }
                    break;
                case MENS_DAY:
                    if (employee.getGender() == Gender.MALE) {
                        System.out.println("С 23 Февраля, " + employee.getName() + "!");
                    }
                    break;
                default:
                    System.out.println("Сегодня нет праздника для поздравлений.");
                    return;
            }
        }
    }
}
