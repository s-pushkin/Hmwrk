package ru.mirea.practice.work9;

import java.util.Locale;

public class Test {
    void buildDictionary(String text) {
        text = text.toLowerCase(Locale.ENGLISH);

        int[] result = new int['z' - 'a' + 1];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' & ch <= 'z') {
                result[ch - 'a']++;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println((char) (i + 'a') + " = " + result[i]);
        }
    }
}
