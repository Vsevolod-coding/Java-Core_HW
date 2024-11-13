package Task_2;
/*
Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
чтобы он мог поднять заработную плату всем, кроме руководителей.
В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
*/
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public static void raiseSalary(List<Employee> employees, double percentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                double salaryNew = employee.getSalary() * (1 + percentage /100);
                employee.setSalary(salaryNew);
            }
        }
    }


    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Nik", 4000));
        employees.add(new Manager("Victor", 9800));
        employees.add(new Employee("Joe", 2000));
        employees.add(new Employee("Robert", 3500));

        // До повышения зарплаты
        for (Employee employee : employees) {
            System.out.println(employee.info());
        }
        /*
        Сотрудник: Nik, Зарплата: 4000.0
        Сотрудник: Victor, Зарплата: 9800.0
        Сотрудник: Joe, Зарплата: 2000.0
        Сотрудник: Robert, Зарплата: 3500.0
        */

        // Повышение зп в 2 раза
        Manager.raiseSalary(employees, 100);
        System.out.println();

        // После повышения
        for (Employee employee : employees) {
            System.out.println(employee.info());
        }
        /*
        Сотрудник: Nik, Зарплата: 8000.0
        Сотрудник: Victor, Зарплата: 9800.0
        Сотрудник: Joe, Зарплата: 4000.0
        Сотрудник: Robert, Зарплата: 7000.0
        */
    }
}
