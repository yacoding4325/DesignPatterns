package com.yacoding.dp.proxy.v2;

/**
 * @Author yaCoding
 * @create 2022-05-28 上午 11:51
 */

import java.util.Random;

/**
 * 问题：我想记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？ benchmark
 */

public class Tank implements Movable{

    /**
     * 模拟坦克移动了一段儿时间
     */
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println(start);
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(end - start);
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

interface Movable {
    void move();
}