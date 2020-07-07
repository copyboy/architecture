package com.deepj.architecture.chapter01;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 * try-catch-resource
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-07-07 14:58
 */
public class Chapter01_2_11 {

    public static void main(String[] args) throws Exception {

        copy("d:/tmp.txt", "d:/tmp1.txt");
        copy("d:/tmp.txt", "d:/tmp2.txt");

    }

    private static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[1024];
                int n;
                while ((n = in.read(buf)) >= 0) {
                    out.write(buf, 0, n);
                }
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

    private static void newCopy(String src, String dst) throws IOException {

        try(InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }
        }
    }
}
