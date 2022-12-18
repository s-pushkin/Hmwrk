package ru.mirea.practice.work3;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(", ");
        String[] words = pattern.split("44 ERR, 0.004 EU, 25.98 USD, 28 RUB");

        Pattern pattern1 = Pattern.compile(" ");
        Pattern pattern2 = Pattern.compile("\\.");

        Pattern p = Pattern.compile("USD");
        Pattern p1 = Pattern.compile("RUB");
        Pattern p2 = Pattern.compile("EU");

        for (int i = 0; i < words.length; i++) {
            String[] word1 = pattern1.split(words[i]);
            String[] word2 = pattern2.split(word1[0]);
            if (word2.length == 2) {
                if (word2[1].length() > 2) {
                    words[i] = "";
                    continue;
                }
            }
            Matcher matcher = p.matcher(word1[1]);
            Matcher matcher1 = p1.matcher(word1[1]);
            Matcher matcher2 = p2.matcher(word1[1]);
            boolean bool = matcher.matches();
            boolean bool1 = matcher1.matches();
            boolean bool2 = matcher2.matches();
            if (!bool & !bool1 & !bool2) {
                words[i] = "";
            }
        }
        for (String word : words) {
            if (!Objects.equals(word, "")) {
                System.out.println(word);
            }
        }
    }
}
