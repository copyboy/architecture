package com.deepj.architecture.chapter01;


import com.deepj.architecture.common.LangEnum;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Java基础；语法糖及其实现机制 -> switch-case
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-22-22:05
 */
public class Chapter01_2_1 {

    public static String switchStrCase(String name) {

        String personDeclaration;
        switch (name) {
            case "job":
                personDeclaration = "I'm job, I'm a student.";
                break;
            case "mic":
                personDeclaration = "I'm mic, I work for APPLE.";
                break;
            case "rues":
                personDeclaration = "I'm rues, I was a football player.";
                break;
            default:
                personDeclaration = "Hi, welcome to deepj's tutorial blog. ";
        }
        return personDeclaration;
    }

    public static String switchEnumCase(LangEnum lang) {

        System.out.println("ordinal >>> " + lang.ordinal());

        String lanLabel;
        switch (lang) {
            case JAVA:
                lanLabel = "Java is simple.";
                break;
            case PHP:
                lanLabel = "PHP is the best.";
                break;
            case PYTHON:
                lanLabel = "Life is short you need python.";
                break;
            default:
                lanLabel = "Talk is cheap, show me the code.";
        }
        return lanLabel;
    }

    public static String switchIntCase(int x) {
        String caseWhen;
        switch (x) {
            case 'A':
                caseWhen = "char case in int switch.";
                break;
            case (byte) 127:
                caseWhen = "byte case in int switch.";
                break;
            case (short) 32767:
                caseWhen = "short case in int switch.";
                break;
            case 0x7fffffff:
                caseWhen = "int case in int switch.";
                break;
            default:
                caseWhen = "deepj's. int case default.";
        }
        return caseWhen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(LangEnum.JAVA.ordinal());
            System.out.println(switchEnumCase(LangEnum.JAVA));
            System.out.println(Arrays.toString(LangEnum.values()));
        }
    }
}
