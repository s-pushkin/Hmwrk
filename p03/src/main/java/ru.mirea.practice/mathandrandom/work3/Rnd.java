package ru.mirea.practice.mathandrandom.work3;

abstract class Rnd {
    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        final int min = 10;
        final int max = 99;
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            final int rnd = rnd(min, max);
            a[i] = rnd;
            System.out.print(a[i] + " ");
        }
        int z = 0;
        for (int i = 0; i <= 2; ) {
            for (int j = i + 1; j <= 3; ) {
                if (a[i] <= a[j]) {
                    if (j == 3) {
                        System.out.println("\nStrictly increasing sequence");
                        z = 1;
                        break;
                    } else {
                        i++;
                        j++;
                    }
                } else {
                    System.out.println("\nNon-strictly increasing sequence");
                    z = 1;
                    break;
                }
            }
            if (z == 1) {
                break;
            }
        }
    }
}
