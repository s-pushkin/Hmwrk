package ru.mirea.practice.mathandrandom.work1;

import java.util.Random;

abstract class GenerateRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        int randInt = rand.nextInt(10);
        double[] a = new double[randInt];
        for (int i = 0; i < randInt; i++) {
            double randDub = rand.nextDouble();
            a[i] = randDub;
            System.out.println(a[i]);
        }

        for (int i = 0; i < randInt - 1; i++) {
            for (int j = i + 1; j < randInt; j++) {
                if (a[i] > a[j]) {
                    double c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }

        System.out.println("\n");
        for (int i = 0; i < randInt; i++) {
            System.out.println(a[i]);
        }
    }
}
