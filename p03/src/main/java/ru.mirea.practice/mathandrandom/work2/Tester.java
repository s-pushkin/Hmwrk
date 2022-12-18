package ru.mirea.practice.mathandrandom.work2;

public class Tester {
    private final int a;
    private final Circle[] arr;

    Tester(int a) {
        this.a = a;
        this.arr = new Circle[a];
    }

    public void setCircle(Circle k, int z) {
        this.arr[z] = k;
    }

    public void getBig() {
        Circle buff = arr[0];
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (arr[i].getR() >= arr[j].getR() & buff.getR() < arr[i].getR()) {
                    buff = arr[i];
                } else if (buff.getR() < arr[j].getR()) {
                    buff = arr[j];
                }
            }
        }
        System.out.println(buff);
    }

    public void getSmall() {
        Circle buff = arr[0];
        for (int i = 0; i < a - 1; i++) {
            for (int j = i + 1; j < a; j++) {
                if (arr[i].getR() <= arr[j].getR() & buff.getR() > arr[i].getR()) {
                    buff = arr[i];
                } else if (buff.getR() > arr[j].getR()) {
                    buff = arr[j];
                }
            }
        }
        System.out.println(buff);
    }

    public void sort() {
        for (int i = 0; i < this.a - 1; i++) {
            for (int j = 1; j < this.a; j++) {
                if (this.arr[i].getR() > this.arr[j].getR()) {
                    Circle buff = this.arr[j];
                    this.arr[j] = this.arr[i];
                    this.arr[i] = buff;
                }
            }
        }
    }

    @Override
    public String toString() {
        System.out.println("\n");
        for (int i = 0; i < this.a; i++) {
            System.out.println("{" + this.arr[i].toString() + "}");
        }
        return " ";
    }
}
