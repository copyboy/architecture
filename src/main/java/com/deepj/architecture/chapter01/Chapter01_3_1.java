package com.deepj.architecture.chapter01;

/**
 * 包装类
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-07-08 16:28
 */
public class Chapter01_3_1 {

    public static void main(String[] args) {
//        character_test();

//        System.out.println(forDigitTest(11, 36));
//        otherJudge();
        byteTest();
    }


    private static void character_test() {

        Character ch = new Character('A');
        System.out.println(ch.hashCode());

        Character a = Character.reverseBytes('A');
        System.out.println(a.hashCode());

        Character b = reverseBytes(ch);
        System.out.println(Integer.toHexString(b.hashCode()));
        System.out.println(b.hashCode());

    }

    public static char reverseBytes(char ch) {
        return (char) ((ch >> 8) | (ch << 8));
    }

    public static char forDigitTest(int digit, int radix) {
        char ret = Character.forDigit(digit, radix);
        System.out.println(">>> " + ret);
        return ret;
    }

    public static void otherJudge() {
        System.out.println(Character.isAlphabetic(12));
        System.out.println(Character.isDefined(12));
        System.out.println(Character.isDigit(9));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLetterOrDigit('0'));
    }

    public static void byteTest() {
        System.out.println(Byte.toUnsignedInt((byte) 'A'));
    }

}
