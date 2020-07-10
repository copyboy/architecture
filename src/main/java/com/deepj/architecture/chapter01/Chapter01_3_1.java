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
//        integerTest();
//        intTest2();
        intTest3();
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
    private static void integerTest() {
        int a = 0x12345678;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a);

        int b = Integer.reverse(a);
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toHexString(b));
        System.out.println(b);

        int c = Integer.reverseBytes(a);
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toHexString(c));

//        0001_0010_0011_0100_0101_0110_0111_1000
//        0001_1110_0110_1010_0010_1100_0100_1000
//        0111_1000_0101_0110_0011_0100_0001_0010
    }

    // Integer 类型前面多少个0，后面多少个0
    private static void intTest2() {
        System.out.println(Integer.numberOfLeadingZeros(0xf0445566)); // 推断为0
        System.out.println(Integer.numberOfLeadingZeros(0x1f445566)); // 推断为3

        System.out.println(Integer.numberOfTrailingZeros(0x00ff1241)); // 推断为0
        System.out.println(Integer.numberOfTrailingZeros(0x00ff1244)); // 推断为2
        /**
         * 结果
         * 0
         * 3
         * 0
         * 2
         */
    }

    private static void intTest3() {

        System.out.println(Integer.bitCount(0x1234));
        System.out.println(Integer.toBinaryString(0x1234));

    }
}
