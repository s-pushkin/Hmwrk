package ru.mirea.practice.work8;

abstract class Main {
    public static void main(String[] args) {

        String[] strings = new String[3];
        strings[0] = "aseg";
        strings[1] = "dsfh";
        strings[2] = "soeikg";
        Test test = new Test();
        test.filter(strings);
        test.apply("aseg");
    }
}
