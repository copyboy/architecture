package com.deepj.architecture.chapter01;

import java.security.SecureRandom;
import java.util.Random;

/**
 * 随机数
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-07-10 10:45
 */
public class Chapter01_3_2 {

    public static void main(String[] args) {
        randomTest();
//        secureRandomTest();
    }


    // 伪随机数，只要种子一致，生成的数，就有规律可行
    private static void randomTest() {

        // 只要seed 一样，就可以预测接下来的值
        Random random = new Random(123);
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextLong());

        Random random1 = new Random(123);
        System.out.println(random1.nextInt());
        System.out.println(random1.nextInt());
        System.out.println(random1.nextInt());
        System.out.println(random1.nextLong());
//        -1188957731
//        4376377975854828753
//        -1188957731
//        4376377975854828753
    }

    private static void secureRandomTest() {

        SecureRandom  random = new SecureRandom("123".getBytes());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextLong());

        System.out.println("==========================");

        SecureRandom random1 = new SecureRandom("123".getBytes());
        System.out.println(random1.nextInt());
        System.out.println(random1.nextInt());
        System.out.println(random1.nextInt());
        System.out.println(random1.nextLong());

    }

}
