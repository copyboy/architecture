package com.deepj.architecture.chapter01;

/**
 * 条件编译
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-7-7-0:54
 */
public class Chapter01_2_7 {


    public static void main(String[] args) {
        say();
    }

    private static void say() {
        if (false) {
            System.out.println("false not show.");
        }
    }
}
