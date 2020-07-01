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
        Integer i = 10;
        int j = i;
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

}

