package ru.mirea.practice.work1to3;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

abstract class Main {
    public static List<Work> mergeSort(List<Work> newList) {
        if (newList == null) {
            return newList;
        }
        if (newList.size() < 2) {
            return newList;
        }

        List<Work> left = new ArrayList<>(newList.size() / 2);
        List<Work> right = new ArrayList<>(newList.size() - newList.size() / 2);

        for (int i = 0; i < newList.size() / 2; i++) {
            left.add(i, newList.get(i));
        }

        for (int i = newList.size() / 2; i < newList.size(); i++) {
            int j = i - newList.size() / 2;
            right.add(j, newList.get(i));
        }
        mergeSort(left);
        mergeSort(right);

        for (int i = 0; i < left.size(); i++) {
            for (int j = 0; j < right.size(); j++) {
                if (left.get(i).getMark() > right.get(j).getMark()) {
                    Work buff = new Work(left.get(i).getMark());
                    left.set(i, right.get(j));
                    right.set(j, buff);
                }
            }
        }
        int k = 0;
        for (int i = 0; i < left.size(); i++) {
            newList.set(i, left.get(i));
            k++;
        }
        for (int i = k; i < newList.size(); i++) {
            int j = i - k;
            newList.set(i, right.get(j));
        }
        return newList;
    }

    public static int[] mergeSort(int[] arr) {
        if (arr == null) {
            return arr;
        }
        if (arr.length < 2) {
            return arr;
        }

        int[] left = new int[arr.length / 2];
        int[] right = new int[arr.length - arr.length / 2];

        for (int i = 0; i < arr.length / 2; i++) {
            System.arraycopy(arr, 0, left, 0, arr.length / 2);
        }

        for (int i = arr.length / 2; i < arr.length; i++) {
            System.arraycopy(arr, arr.length / 2, right, 0, arr.length - arr.length / 2);
        }
        mergeSort(left);
        mergeSort(right);

        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] > right[j]) {
                    int buff = left[i];
                    left[i] = right[j];
                    right[j] = buff;
                }
            }
        }
        int k = 0;
        for (int i = 0; i < left.length; i++) {
            arr[i] = left[i];
            k++;
        }
        for (int i = k; i < arr.length; i++) {
            int j = i - k;
            arr[i] = right[j];
        }
        return arr;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] arr1 = new Integer[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = rand.nextInt(10);
            arr2[i] = rand.nextInt(10);
        }

        SortingStudentsbygpa a = new SortingStudentsbygpa(arr2);
        a.setArray(arr2);
        Arrays.sort(arr1, Collections.reverseOrder());

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr1[i]);
        }

        Student student = new Student("sdf", "sdg", "aawf", 32, "sdg");
        Student student1 = new Student("asfa", "asd", "asdg", 12, "dfh");
        Student student2 = new Student("dfg", "dfgs", "asedhrsdg", 123, "vbjj");
        Student[] students = new Student[]{student, student1, student2};
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 1; j < students.length; j++) {
                if ((int) students[i].getName().charAt(0) > (int) students[j].getName().charAt(0)) {
                    Student buff = students[i];
                    students[i] = students[j];
                    students[j] = buff;
                }
            }
        }
        for (int i = 0; i < student.getName().length(); i++) {
            System.out.println(students[i].toString());
        }

        List<Work> list1 = new ArrayList<>(3);
        list1.add(new Work(27));
        list1.add(new Work(132));
        list1.add(new Work(1));

        List<Work> list2 = new ArrayList<>(3);
        list2.add(new Work(100));
        list2.add(new Work(23));
        list2.add(new Work(11));
    }
}
