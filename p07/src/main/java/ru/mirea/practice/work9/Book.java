package ru.mirea.practice.work9;

public class Book implements Printable {
    public static void printBooks(Printable[] printable) {
        for (Printable value : printable) {
            System.out.println(value instanceof Book);
        }
    }

    @Override
    public void print() {
        System.out.println("something");
    }
}
