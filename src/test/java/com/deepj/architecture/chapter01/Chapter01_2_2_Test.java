package com.deepj.architecture.chapter01;

import com.deepj.architecture.common.Cat;
import com.deepj.architecture.common.Dog;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Java基础；语法糖及其实现机制 -> 泛型
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-22-22:05
 */
class Chapter01_2_2_Test {

    @Test
    public void generic_without() {

        Map map = new HashMap();
        map.put("cat1", new Cat("Cat1"));
        map.put("cat2", new Cat("Cat2"));
        map.put("cat3", new Cat("Cat3"));
        map.put("cat4", new Dog("Dog1"));

//        for (int i = 0; i < map.size(); i++) {
//            Cat cat = (Cat) map.get("cat" + (i + 1));
//            System.out.println(cat.getName());
//        }
        for (int i = 0; i < map.size(); i++) {
            Object o = map.get("cat" + (i + 1));
            if (o instanceof Cat) {
                Cat cat = (Cat) o;
                System.out.println(cat.getName());
            } else if (o instanceof Dog) {
                Dog dog = (Dog) o;
                System.out.println("忽略DOG的参数"+dog.getName());
            }
        }
    }

}

