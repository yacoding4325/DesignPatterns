package com.yacoding.dp.proxy.v1;

/**
 * @Author yaCoding
 * @create 2022-05-28 上午 11:46
 */

import java.util.Random;

/*** 问题：我想记录坦克的移动时间*/

public class Tank implements Movable{
    /**
     * 模拟坦克移动了一段儿时间
     */

    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

interface Movable {
    void move();
}