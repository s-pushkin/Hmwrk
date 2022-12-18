package ru.mirea.practice.mathandrandom.work2;

public class Circle {
    private Point center;
    private double r;

    Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public double getR() {
        return this.r;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setAll(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    @Override
    public String toString() {
        return "{" + "Радиус = " + r + ", Координаты центра окружности: " + center + "}";
    }
}
