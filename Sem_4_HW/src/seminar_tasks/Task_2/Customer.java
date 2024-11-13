package seminar_tasks.Task_2;

public class Customer {
    private String surName;
    private String name;
    private String midName;
    private String email;

    public Customer(String surName, String name, String midName, String email) {
        this.surName = surName;
        this.name = name;
        this.midName = midName;
        this.email = email;
    }

    public String getFullName() {
        return surName + " " + name + " " + midName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
