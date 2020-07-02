package com.deepj.architecture.chapter01;

import java.util.function.Predicate;

/**
 * 枚举
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-30-22:51
 */
public class Chapter01_2_5 {

    public static void main(String[] args) {

        ApiStatus status = ApiStatus.SUCCESS;
        System.out.println(status);
        int result = Operator.ADD.eval(3, 5);
        boolean test = AssertEnum.fetchResult.test(ApiStatus.SUCCESS);

    }

    enum ApiStatus {
        SUCCESS,
        ERROR,
        ;
    }

    enum ApiResult {
        SUCCESS("0000", "成功"),
        ERROR("0001", "失败"),
        ERROR_404("0002", "请求不存在"),
        ;
        private String code;
        private String msg;

        ApiResult(String code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public String getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }

    }

    enum Operator {

        ADD("+") {
            @Override
            public int eval(int a, int b) {
                return a + b;
            }
        },

        ;
        private String code;

        Operator(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public abstract int eval(int x, int y);
    }

    enum AssertEnum implements Predicate<ApiStatus> {

        fetchResult {
            @Override
            public boolean test(ApiStatus apiStatus) {
                return apiStatus == ApiStatus.SUCCESS;
            }
        },

        ;
    }
}
