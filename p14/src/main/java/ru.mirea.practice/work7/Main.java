package ru.mirea.practice.work7;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(", ");
        String[] words = pattern.split("smart_pass, F032_Password, TrySpy1, A007");

        Pattern p1 = Pattern.compile("[0-9]");
        Pattern p2 = Pattern.compile("_");

        for (String word : words) {
            if (word.length() >= 8) {
                int buff = 0;
                for (int i = 0; i < word.length(); i++) {
                    String check = word.charAt(i) + "";
                    Matcher m1 = p1.matcher(check);
                    Matcher m2 = p2.matcher(check);

                    if (check.equals(check.toUpperCase(Locale.ENGLISH)) & ((check.charAt(0) >= 'a' & check.charAt(0)
                            <= 'z') | (check.charAt(0) >= 'A' & check.charAt(0) <= 'Z'))) {
                        buff++;
                    }

                    if (!m1.matches() & !m2.matches() & !(check.charAt(0) >= 'a' & check.charAt(0) <= 'z')
                            & !(check.charAt(0) >= 'A' & check.charAt(0) <= 'Z')
                            | (buff == 0 & i == word.length() - 1)) {
                        System.out.println("Неверный символ или нехватает заглавной буквы");
                        break;
                    } else if (i == word.length() - 1) {
                        System.out.println(word);
                    }
                }
            } else {
                System.out.println("Ненадежный пароль");
            }
        }
    }
}
