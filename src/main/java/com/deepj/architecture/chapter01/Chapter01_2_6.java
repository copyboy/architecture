package com.deepj.architecture.chapter01;

import org.springframework.util.ObjectUtils;

import java.util.function.Predicate;

/**
 * 内部类
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-30-22:51
 */
public class Chapter01_2_6 {

    private String version = "1.0";

    public static void main(String[] args) {
//        Chapter01_2_6.Inner02 inner02 = new Chapter01_2_6().new Inner02();
//        inner02.print();
//        new Chapter01_2_6().showClass();
        new Chapter01_2_6().showAnonymous();
    }

//    // 静态内部类
//    public static class Inner01 {
//        public static final String version = "1.0";
//    }

    // 非静态内部类

//    public class Inner02 {
//
//        private String ver = "2.0";
//
//        public void print() {
//            System.out.println(Inner02.this.ver);
//            System.out.println(Chapter01_2_6.this.version);
//        }
//    }

    // 局部内部类
    public void showClass() {

        class Inner03 {
            public void print03() {
                System.out.println(Chapter01_2_6.this.version);
            }
        }
        new Inner03().print03();
    }

    // 匿名内部类
    public void showAnonymous(){

        Predicate nullPredicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return ObjectUtils.isEmpty(o);
            }
        };
        System.out.println(nullPredicate.test(1L));
        System.out.println(nullPredicate.test("abc"));
        System.out.println(nullPredicate.test(null));
        System.out.println(nullPredicate.test(""));

    }

}

//class Chapter01_2_6_1 {
//    public static void main(String[] args) {
//        System.out.println("world");
//    }
//}
