package com.yacoding.dp.spring.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Author yaCoding
 * @create 2022-05-28 下午 8:19
 */

@Aspect
public class TimeProxy {

    @Before("execution (void com.yacoding.dp.spring.v2.Tank.move())")
    public void before() {
        System.out.println("method start.." + System.currentTimeMillis());
    }

    @After("execution (void com.yacoding.dp.spring.v2.Tank.move())")
    public void after() {
        System.out.println("method stop.." + System.currentTimeMillis());
    }

}
