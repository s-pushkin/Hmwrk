package ru.mirea.practice.mathandrandom.work1;

abstract class GenRand {
    public static void main(String[] args) {
        double[] a = new double[5];
        for (int i = 0; i < 5; i++) {
            a[i] = Math.random();
            System.out.println(a[i]);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (a[i] > a[j]) {
                    double c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }

        System.out.println("\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}
