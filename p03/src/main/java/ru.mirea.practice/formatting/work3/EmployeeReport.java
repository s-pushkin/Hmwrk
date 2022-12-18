package ru.mirea.practice.formatting.work3;

abstract class EmployeeReport {
    public static void main(String[] args) {
        Employee[] a = new Employee[3];
        a[0] = new Employee("Петров Иван Сергеевич", 34567.567);
        a[1] = new Employee("Володин Михаил Иванович", 58190.628);
        a[2] = new Employee("Сорокин Георгий Павлович", 184924.293);
        Report b = new Report();
        b.generateReport(a);
    }
}
