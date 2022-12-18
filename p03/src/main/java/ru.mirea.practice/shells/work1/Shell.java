package ru.mirea.practice.shells.work1;

abstract class Shell {
    public static void main(String[] args) {

        Double a = Double.valueOf(5.9);
        System.out.println(a);
        Double b = Double.parseDouble("1.3");
        System.out.println(b);
        Integer c = a.intValue();
        int d = c;
        System.out.println(d);
        Byte e = a.byteValue();
        byte f = e;
        System.out.println(f);
        Short g = a.shortValue();
        short h = g;
        System.out.println(h);
        Long i = a.longValue();
        long j = i;
        System.out.println(j);
        Float k = a.floatValue();
        float l = k;
        System.out.println(l);
        double n = a;
        System.out.println(n);
        System.out.println(a);

        String m = Double.toString(3.14);
        System.out.println(m);
    }
}
