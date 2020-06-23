package com.deepj.architecture.chapter01;

/**
 * Java基础；语法糖及其实现机制
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-22-22:05
 */
public class Chapter0121 {
    public static void main(String[] args) {

        // 1) switch case
        int x = 3;
        int w = 2^3;
        System.out.println(w);
        int y = switchCase(2^31);
        System.out.println(y);

        String name = "name";
        String name1 = new String("rues");
        String name2 = new String("rues");
        System.out.println(name1 == name2);
        String person = switchNameCase(name1);
        System.out.println(person);

    }

    private static String switchNameCase(String name) {

        String person;
        switch (name){
            case "job":
                person = "job";
                break;
            case "mic":
                person = "mic";
                break;
            case "rues":
                person = "rues";
                break;
            default:
                person = "deepj";
        }
        return person;
    }

    private static int switchCase(int x) {
        int y;
        switch (x) {
            case (byte)127:
                y = 127;
                break;
            case (short)128:
                y = x+2;
                break;
            case 2^31:
                y = 2^31-1;
                break;
            case (char)4:
                y = 2^16;
                break;
            case 'a':
                y = 2^16;
                break;
            default:
                y = x;
        }
        return y;
    }

    private static int switchDoubleCase(double x) {
        int y;
        switch (x) {
            case (byte)127:
                y = 127;
                break;
            case (short)128:
                y = (int)x+2;
                break;
            case 2^31:
                y = 2^31-1;
                break;
            case (char)4:
                y = 2^16;
                break;
            case "adc":
                y = 2^16;
                break;
            default:
                y = (int)x;
        }
        return y;
    }
}
