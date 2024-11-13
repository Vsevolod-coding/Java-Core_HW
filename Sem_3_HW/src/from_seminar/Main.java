package from_seminar;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Shalapo", "Maxim", "Petrovich", "Manager", "89201234567", 80_000, 50),
                new Employee("Ivanov", "Ivan", "Alexandrovich", "Frontend-dev", "89998889911", 58_000, 48),
                new Employee("Kuznetsova", "Olga", "Sergeevna", "Backend-Java", "89209990000", 82_500, 32),
                new Employee("Smirnov", "Dmitry", "Alexandrovich", "Fullstack", "89156785432", 35_000, 22),
                new Employee("Volkova", "Marina", "Nikolaevna", "UI designer", "89557777777", 70_000, 29),

        };

        Employee.increaseSalaryForOlderEmployees(employees, 30, 10_000);
        for (Employee employee : employees) {
            System.out.println(employee.info());
            System.out.println();
        }

        System.out.println(Employee.avgAge(employees));
        System.out.println(Employee.avgSalary(employees));
    }
}
