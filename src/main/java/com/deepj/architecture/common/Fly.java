package com.deepj.architecture.common;

/**
 * Java基础；语法糖及其实现机制 -> 泛型上限
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-22-22:05
 */
public class Fly<T extends Animal> {

    private T animal;

    public void eat() {
        animal.eat();
    }
    public void run(){
        animal.run();
    }

}
