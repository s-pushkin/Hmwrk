package ru.mirea.practice.formatting.work3;

public class Employee {
    private String fullname;
    private double salary;

    Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public double getsalary() {
        return this.salary;
    }

    public String getfullname() {
        return this.fullname;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public void setfullname(String fullname) {
        this.fullname = fullname;
    }

    public void setAll(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{Полное имя: " + fullname + "Зарплата = " + salary + "}";
    }
}
