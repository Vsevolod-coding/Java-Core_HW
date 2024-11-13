package homework_4.employee;

import homework_4.Gender;

public class Employee {
    private String name;
    private double salary;
    private Gender gender;

    public Employee(String name, double salary, Gender gender) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public String info() {
        return "Сотрудник: " + name + ", Зарплата: " + salary + ", Пол: " + gender;
    }
}
