package com.deepj.architecture.common;

/**
 * Java基础；语法糖及其实现机制 -> 泛型类
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-22-22:05
 */
public class Person<T> {

    private T person;

    public T getPerson() {
        return person;
    }

    public void setPerson(T person) {
        this.person = person;
    }
}
