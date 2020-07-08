package com.deepj.architecture.chapter01;


import java.util.ArrayList;

/**
 * Object 类
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-07-08 15:58
 */
public class Chapter01_3_11 {

    public static void main(String[] args) {

    }

    private static void objIsAllParent() {
        Object obj = new String("123");
        Object obj1 = new Integer(123);
        Object obj2 = new ArrayList<>();
    }

}
