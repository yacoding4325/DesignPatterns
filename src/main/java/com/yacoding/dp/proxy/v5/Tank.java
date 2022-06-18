package com.yacoding.dp.proxy.v5;

/**
 * @Author yaCoding
 * @create 2022-05-28 下午 4:12
 */

import java.util.Random;

/**
 * 问题：我想记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 * 用继承？
 */

public class Tank implements Movable {


    @Override
    public void move() {
        System.out.println("Tank moving baba....");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TankTimeProxy (new Tank()).move();
    }
}

class TankTimeProxy implements Movable {

    Tank tank;

    public TankTimeProxy (Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

interface Movable {
    void move();
}