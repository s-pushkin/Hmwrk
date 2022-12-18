package ru.mirea.practice.mathandrandom.work2;

abstract class Main {
    public static void main(String[] args) {
        Point p = new Point(35, 24);
        Circle a = new Circle(p, Math.random());
        Circle b = new Circle(p, Math.random());
        Circle c = new Circle(p, Math.random());

        Tester ar = new Tester(3);
        ar.setCircle(a, 0);
        ar.setCircle(b, 1);
        ar.setCircle(c, 2);
        System.out.println("\\\\\\\\\\\\\\\\\\");
        ar.getBig();
        ar.getSmall();
        System.out.println("\\\\\\\\\\\\\\\\\\");
        ar.sort();

        System.out.println(ar.toString());
    }
}
