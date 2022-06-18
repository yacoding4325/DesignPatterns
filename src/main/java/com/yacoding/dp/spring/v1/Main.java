package com.yacoding.dp.spring.v1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author yaCoding
 * @create 2022-05-28 下午 6:18
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Tank t = (Tank)context.getBean("tank");
        t.move();
    }
}
