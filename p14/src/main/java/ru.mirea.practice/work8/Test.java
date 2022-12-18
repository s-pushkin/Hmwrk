package ru.mirea.practice.work8;

class Test implements Filter {
    private Object[] arr;

    Test(Object[] arr) {
        this.arr = arr;
    }

    Test() {
        this.arr = new Object[0];
    }

    public Object[] getArr() {
        return arr;
    }

    @Override
    public void apply(Object o) {
        int buff = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].equals(0)) {
                buff = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != buff) {
                System.out.println(arr[i]);
            }
        }
    }

    public Object[] filter(Object[] arr) {
        this.arr = arr;
        return arr;
    }
}
