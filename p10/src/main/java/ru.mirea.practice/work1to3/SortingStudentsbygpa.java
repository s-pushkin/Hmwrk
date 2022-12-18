package ru.mirea.practice.work1to3;

import java.util.Comparator;

public class SortingStudentsbygpa implements Comparator<SortingStudentsbygpa> {
    public int[] idNumber;

    public void setArray(int[] marks) {
        System.arraycopy(marks, 0, this.idNumber, 0, marks.length);
    }

    SortingStudentsbygpa(int[] arr) {
        this.idNumber = arr;
    }

    public int[] outArray() {
        return this.idNumber;
    }

    public int getMark(int i) {
        return this.idNumber[i];
    }

    @Override
    public int compare(SortingStudentsbygpa o1, SortingStudentsbygpa o2) {
        if (o1.equals(o2)) {
            return 0;
        }
        for (int i = 0; i < idNumber.length - 1; i++) {
            for (int j = 1; j < idNumber.length; j++) {
                if (o1.getMark(i) < o2.getMark(j)) {
                    return 1;
                }
            }
        }
        return -1;
    }
}
