package ru.mirea.practice.shells.work2;

abstract class Shell {
    public static void main(String[] args) {

        Boolean bo = Boolean.FALSE;
        System.out.println(bo);
        Character ch = 'b';
        System.out.println(ch);
        Byte by = (byte) 0b10;

        by.byteValue();
        by.floatValue();
        by.intValue();
        by.longValue();
        by.doubleValue();
        by.shortValue();

        Double dou = 5.9;

        dou.byteValue();
        dou.floatValue();
        dou.intValue();
        dou.longValue();
        dou.doubleValue();
        dou.shortValue();

        Float fl = (float) 6.7;

        fl.byteValue();
        fl.floatValue();
        fl.intValue();
        fl.longValue();
        fl.doubleValue();
        fl.shortValue();

        Integer in = 2 ^ 60;

        in.byteValue();
        in.floatValue();
        in.intValue();
        in.longValue();
        in.doubleValue();
        in.shortValue();

        Long lo = (long) (2 ^ 100);

        lo.byteValue();
        lo.floatValue();
        lo.intValue();
        lo.longValue();
        lo.doubleValue();
        lo.shortValue();

        Short sh = (short) 2;

        sh.byteValue();
        sh.floatValue();
        sh.intValue();
        sh.longValue();
        sh.doubleValue();
        sh.shortValue();

        Boolean.parseBoolean("true");
        Byte.parseByte("0b0111_1111", 1);
        Double.parseDouble("5.7");
        Float.parseFloat("4.9");
        Integer.parseInt("2^59", 1);
        Long.parseLong("2^99", 1);
        Short.parseShort("10", 1);

        Byte.valueOf("0B1000_0000", 2);
        Integer.valueOf("2^58", 2);
        Long.valueOf("2^98", 2);
        Short.valueOf("9", 2);

        Boolean.toString(false);
        Byte.toString((byte) 4);
        Character.toString('g');
        Double.toString(4.7);
        Float.toString((float) 7.9);
        Integer.toString(2 ^ 57, 3);
        Long.toString(2 ^ 97, 3);
        Short.toString((short) 8);
    }
}
