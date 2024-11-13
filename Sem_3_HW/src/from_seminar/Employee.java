package from_seminar;// Создать класс ”Сотрудник” с полями: ФИО, должность, телефон,
// зарплата, возраст;

public class Employee {
    private String name;
    private String midName;
    private String surname;
    private String position;
    private String phone;
    private double salary;
    private int age;


    public Employee(String surname,String name, String midName, String position, String phone, double salary, int age) {
        this.surname = surname;
        this.name = name;
        this.midName = midName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getFullName() {
        return surname + " " + name + " " + midName;
    }

    public void setFullName(String surname, String name, String midName) {
        this.surname = surname;
        this.name = name;
        this.midName = midName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String info() {
        return String.format(
                "ФИО: %s %s %s%nДолжность: %s%nТелефон: %s%nЗарплата: %.2f%nВозраст: %d",
                surname, name, midName,
                position,
                phone,
                salary,
                age
        );
    }

    // метод, повышающий зарплату всем сотрудникам старше 45 лет
    public static void increaseSalaryForOlderEmployees(Employee[] employees, int ageThreshold, double raiseAmount) {
        for (Employee employee : employees) {
            if (employee.getAge() > ageThreshold) {
                employee.setSalary(employee.getSalary() + raiseAmount);
            }
        }
    }

    //  Написать методы (принимающие на вход массив сотрудников),
    // вычисляющие средний возраст и среднюю зарплату сотрудников, вывести
    // результаты работы в консоль.
    public static String avgAge(Employee[] employees) {
        int countEmp = employees.length;
        double sumAges  = 0;

        for (Employee employee : employees) {
            sumAges += employee.getAge();
        }

        return "Avg age: " + (sumAges / countEmp);
    }

    public static String avgSalary(Employee[] employees) {
        int countEmp = employees.length;
        double sumSalary  = 0;

        for (Employee employee : employees) {
            sumSalary += employee.getSalary();
        }

        return "Avg age: " + (sumSalary / countEmp);
    }
}

