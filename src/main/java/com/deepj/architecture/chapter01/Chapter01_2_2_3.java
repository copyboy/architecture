package com.deepj.architecture.chapter01;

import java.util.*;

/**
 * 泛型 类型通配符
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-30-22:51
 */
public class Chapter01_2_2_3 {
    public static void main(String[] args) {
        System.out.println("1");
    }
}

class CommonCharacter{

    // Raw use of parameterized class 'List'  不够优雅
    public void test0(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    // 使用通配符来适配所有的List参数对象，默认? 继承自 Object
    public void test1(List<?> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    // 当List内容上限已知时，可以限定该上限
    public void test2(List<? extends Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).intValue());
        }
    }
    // 有上限就会有下限，下限使用场景：<? super Type> 传递进来的只能是Type或Type的父类
    // 使用场景较少，暂时能想到的只有 Comparator ，当某个对象需要组合其他对象的功能时，可能需要实现
    public void test3(Comparator<? super TreeSet<?>> comparator) {
    }
}