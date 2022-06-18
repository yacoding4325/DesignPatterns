package com.yacoding.dp.spring.v1;

/**
 * @Author yaCoding
 * @create 2022-05-28 下午 6:17
 */

public class TimeProxy {

    public void before() {
        System.out.println("method start.." + System.currentTimeMillis());
    }

    public void after() {
        System.out.println("method stop.." + System.currentTimeMillis());
    }

}
