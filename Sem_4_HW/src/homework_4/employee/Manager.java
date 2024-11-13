package homework_4.employee;
/*
Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
чтобы он мог поднять заработную плату всем, кроме руководителей.
В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
*/
import homework_4.Gender;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    public Manager(String name, double salary, Gender gender) {
        super(name, salary, gender);
    }

    public static void raiseSalary(List<Employee> employees, double percentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                double salaryNew = employee.getSalary() * (1 + percentage /100);
                employee.setSalary(salaryNew);
            }
        }
    }
}
