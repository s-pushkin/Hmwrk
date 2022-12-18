package ru.mirea.practice.work5to6;

class ProcessStrings implements Strings {
    private String string;

    ProcessStrings(String string) {
        this.string = string;
    }

    @Override
    public int symbols() {
        return string.length();
    }

    @Override
    public String refactor() {
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < string.length(); i += 2) {
            builder.append(string.charAt(i));
        }
        return builder.toString();
    }

    @Override
    public String invert() {
        StringBuilder builder = new StringBuilder("");
        for (int i = string.length() - 1; i >= 0; i--) {
            builder.append(string.charAt(i));
        }
        return builder.toString();
    }
}
