package ru.mirea.practice.work5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(", ");
        String[] words = pattern.split("29/02/2000, 1/1/1899");

        Pattern p = Pattern.compile("([0-3]+[0-9])/([0-1]+[1-9])/([1-9]+[0-9]+[0-9]+[0-9])");
        Pattern p1 = Pattern.compile("/");

        for (String word : words) {
            Matcher matcher = p.matcher(word);
            if (!matcher.matches()) {
                System.out.println("Error");
            } else {
                String[] words1 = p1.split(word);
                try {
                    int[] buff = new int[]{
                            Integer.parseInt(words1[0].trim()),
                            Integer.parseInt(words1[1].trim()),
                            Integer.parseInt(words1[2].trim()),
                    };
                    if (buff[2] < 1900 | buff[0] == 0 | buff[1] == 0) {
                        System.out.println("Error");
                    } else {
                        if ((buff[1] == (1 | 3 | 5 | 7 | 9 | 11) & buff[0] > 31) | (buff[1] == (4 | 6 | 8 | 10 | 12)
                                & buff[0] > 30) | (buff[1] == 2 & buff[0] > 29)) {
                            System.out.println("Error");
                        } else {
                            System.out.print(word + "\n");
                        }
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Error");
                }
            }
        }
    }
}
