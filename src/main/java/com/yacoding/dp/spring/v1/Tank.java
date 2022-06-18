package com.yacoding.dp.spring.v1;

import java.util.Random;

/**
 * @Author yaCoding
 * @create 2022-05-28 下午 6:15
 */

public class Tank {

    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
