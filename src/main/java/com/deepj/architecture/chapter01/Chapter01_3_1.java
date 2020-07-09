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
//        byteTest();
    }


    // char 字符 hashcode 与 转换方法 reverseBytes
    private static void character_test() {

        Character ch = new Character('A');
        System.out.println(ch.hashCode());

        Character a = Character.reverseBytes('A');
        System.out.println(a.hashCode());

        Character b = reverseBytes(ch);
        System.out.println(Integer.toHexString(b.hashCode()));
        System.out.println(b.hashCode());

    }

    // 去除  & 0xFF00
    public static char reverseBytes(char ch) {
        return (char) ((ch >> 8) | (ch << 8));
    }

    // 数字转字符
    public static char forDigitTest(int digit, int radix) {
        char ret = Character.forDigit(digit, radix);
        System.out.println(">>> " + ret);
        return ret;
    }

    // char 常用判断
    public static void otherJudge() {
        System.out.println(Character.isAlphabetic(12));
        System.out.println(Character.isDefined(12));
        System.out.println(Character.isDigit(9));
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isLetterOrDigit('0'));
    }

    // byte 测试
    public static void byteTest() {
        System.out.println(Byte.toUnsignedInt((byte) 'A'));
    }

    // =========================== Integer 测试 ==============================
    private static void intReverse() {
//        Integer.reverse();
    }
}
