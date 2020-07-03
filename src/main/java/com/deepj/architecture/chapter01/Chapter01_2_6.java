package com.deepj.architecture.chapter01;

/**
 * 内部类
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-30-22:51
 */
public class Chapter01_2_6 {
    public static void main(String[] args) {
        System.out.println("hello");
        Chapter01_2_6.Inner01 inner01 = new Chapter01_2_6().new Inner01();
    }

    public class Inner01 {
    }

}

//class Chapter01_2_6_1 {
//    public static void main(String[] args) {
//        System.out.println("world");
//    }
//}
