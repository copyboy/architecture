package com.deepj.architecture.chapter01;

import java.util.*;

/**
 * for-each 增强型循环
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-07-07 14:02
 */
public class Chapter01_2_10 {

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 123, 5, 6, 7, 897};
        commonCycle(arr);

        System.out.println("\n====================");

        List<Integer> intArr = Arrays.asList(arr);
        iteratorCycle(intArr);

        System.out.println("\n\n=========增强型for循环===========\n");

        for (Integer ii : arr) {
            System.out.print(ii+",");
        }
        System.out.println("\n====================");
        for (Integer jj : intArr) {
            System.out.print(jj+",");
        }

    }

    // 数组循环
    private static void commonCycle(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

    // 迭代器循环
    private static void iteratorCycle(Collection<Integer> collection) {

        for (Iterator<Integer> i = collection.iterator();  i.hasNext() ;) {
            Integer next = i.next();
            System.out.print(next+",");
        }
    }

    private static void errorWhenForEnhance() {

        List<Integer> intArr = null;
        for (Integer ii : intArr) {
            System.out.println(ii);
        }

    }

}
