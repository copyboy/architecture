package com.deepj.architecture.chapter01;

/**
 * 泛型子类的派生
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-6-30-22:38
 */
public class Chapter01_2_2_2 {

}
interface Api<T>{
    Api<T> success(T t);
    Api<T> error(T t);
}
class CommonApi implements Api<String>{

    String code;
    public CommonApi(String code){
        this.code = code;
    }
    @Override
    public Api<String> success(String s) {
        return new CommonApi("SUCCESS="+s);

    }
    @Override
    public Api<String> error(String s) {
        return new CommonApi("ERROR="+s);
    }
}
class AbstractApi<T> implements Api<T> {

    @Override
    public Api<T> success(T t) {
        return null;
    }

    @Override
    public Api<T> error(T t) {
        return null;
    }
}