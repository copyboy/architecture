package com.deepj.architecture.chapter01;

/**
 * 自动装箱拆箱
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-30-22:51
 */
public class Chapter01_2_3 {
    public static void main(String[] args) {
//        Integer i = 10;
//        int j = i;
//        testEqual();
//        testNullPoint();
//        testEquals();
        testPerformance();
    }

    private void testBoolean() {
        Boolean newFlag = true;
        boolean flag = newFlag;
    }

    private void testCharacter() {
        Character ch = 'A';
        char ch1 = ch;
    }

    private void testByte() {
        Byte b = 12;
        byte b1 = b;
    }

    private static void testEqual() {
        Integer a = 127;
        Integer b = 127;
        System.out.println("a == b => " + (a == b));

        Integer x = 128;
        Integer y = 128;
        System.out.println("x == y => " + (x == y));
    }

    private static void testNullPoint() {
        Integer a = 10;
        // ==== 经过各种业务操作 ====
        a = null;
        // ==== 经过各种业务操作 ====
        int b = a;
    }

    private static void testEquals() {
        int a = 128;
        Integer b = 128;
        System.out.println("1>>> " + (a == b));
        System.out.println("2>>> " + b.equals(a));

        System.out.println("3>>> " + b.equals(127 + 1));
        System.out.println("4>>> " + b.equals(127L + 1));
    }

    private static void testPerformance() {
        long time1 = System.currentTimeMillis();
        long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE / 2; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println(System.currentTimeMillis() - time1);

        System.out.println("==========================================");

        long time2 = System.currentTimeMillis();
        Long sum1 = 0L;
        for (int i = 0; i < Integer.MAX_VALUE / 2; i++) {
            sum1 += i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - time2);
    }

}

