package ru.mirea.practice.work2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher matcher = pattern.matcher("abcdefghijklmnoasdfasdpqrstuv18340");
        boolean bool = matcher.matches();
        System.out.println(bool);
    }
}
