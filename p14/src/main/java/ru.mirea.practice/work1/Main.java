package ru.mirea.practice.work1;

import java.util.regex.Pattern;

abstract class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(" ");
        String[] words = pattern.split("soeiugh seoiugh aseoiguh");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
