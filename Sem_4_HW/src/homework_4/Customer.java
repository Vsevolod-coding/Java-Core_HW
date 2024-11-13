package homework_4;

//В класс покупателя добавить перечисление с гендерами, добавить в сотрудника
//свойство “пол” со значением перечисления. добавить геттеры, сеттеры.

public class Customer {
    private String surName;
    private String name;
    private String midName;
    private String email;
    private Gender gender;

    public Customer(String surName, String name, String midName, Gender gender, String email) {
        this.surName = surName;
        this.name = name;
        this.midName = midName;
        this.gender = gender;
        this.email = email;
    }

    public String getFullName() {
        return surName + " " + name + " " + midName;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }
}
