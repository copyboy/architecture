package com.deepj.architecture.chapter01;

/**
 * 方法变长参数
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-7-1-21:30
 */
public class Chapter01_2_4 {

    public static void main(String[] args) {
        sendMsg("deepj");
        sendMsg("deepj", "hello", "world");
    }

    private static void sendMsg(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
    private static void sendMsg(String msg) {
        System.out.println("sendMsg >>> " + msg);
    }

    //    private void sendMsg(String... args, int x) { }
}
