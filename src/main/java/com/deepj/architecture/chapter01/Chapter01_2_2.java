package com.deepj.architecture.chapter01;

import com.deepj.architecture.common.BaseRequest;
import com.deepj.architecture.common.BaseResponse;
import lombok.Data;

/**
 * Java基础；语法糖及其实现机制 -> 泛型
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-22-22:05
 */
public class Chapter01_2_2 {
    public static void main(String[] args) {
        ApiResult<String> result = new ApiResult<>();
    }
}

/**
 * 把
 *
 * @param <T>
 */
@Data
class ApiResult<T> {

    private String code;

    private String msg;

    private T data;

}

class restClient {

    public <T> void send(T req) {
        System.out.println(req.toString());
    }

    public <T extends BaseRequest, R extends BaseResponse> R sendReq(T req, Class<R> clz) {

        System.out.println(req.getSeqNo());
        // restTemplate 请求获取结果，可以直接与restTemplate结合取得对象结果
        // 或者通过获取string 对象,经过Json转化得到实体对象
        R response = null;
//        HttpEntity<String> entity = new HttpEntity<>(req);
//        response = restTemplate.postForObject(url, entity, clz);
        return response;
    }

}