package com.yacoding.dp.spring.v2;

import java.util.Random;

/**
 * @Author yaCoding
 * @create 2022-05-28 下午 8:17
 */

public class Tank {
    /**
     * 模拟坦克移动了一段儿时间
     */
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
