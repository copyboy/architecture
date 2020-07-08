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
        character_test();
    }


    private static void character_test(){

        Character ch = new Character('A');
        System.out.println(ch.hashCode());

        Character a = Character.reverseBytes('A');
        System.out.println(a.hashCode());
    }
}
