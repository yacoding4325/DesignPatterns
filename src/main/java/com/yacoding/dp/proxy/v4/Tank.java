package com.yacoding.dp.proxy.v4;

import java.util.Random;

/**
 * @Author yaCoding
 * @create 2022-05-28 下午 12:00
 */

public class Tank implements Movable {

    /**
     * 模拟坦克移动了一段儿时间
     */
    @Override
    public void move() {

        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

class Tank2 extends Tank {

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}

interface Movable {
    void move();
}
