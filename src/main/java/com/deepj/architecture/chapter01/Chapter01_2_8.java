package com.deepj.architecture.chapter01;

/**
 * 断言
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-7-7-10:16
 */
public class Chapter01_2_8 {

    public static void main(String[] args) throws Exception,Error {

//        try {
            show();
//            throw new RuntimeException("java");
//        } catch (Exception e) {
//            System.out.println("into exception...");
//        } catch (Error e) {
//            System.out.println("into error...");
//        } finally {
//            System.out.println("into finally...");
//        }

//        ServerSocket server = new ServerSocket(8080);
//        while (true) {
//            System.out.println("wait connect...");
//            server.accept();
//        }

    }

    private static void show() {
        assert 3 == add(1,2);
        assert 4 == add(1,2);
    }

    private static int add(int x, int y) {
        return x + y;
    }
}
