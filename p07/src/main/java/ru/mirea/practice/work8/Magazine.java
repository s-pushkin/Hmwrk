package ru.mirea.practice.work8;

public class Magazine implements Printable {
    public static void printMagazines(Printable[] printable) {
        for (Printable value : printable) {
            System.out.println(value instanceof Magazine);
        }
    }

    @Override
    public void print() {
        System.out.println("something");
    }
}