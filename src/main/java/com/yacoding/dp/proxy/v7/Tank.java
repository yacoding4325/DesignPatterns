package com.yacoding.dp.proxy.v7;

/**
 * @Author yaCoding
 * @create 2022-05-28 下午 4:25
 */

import java.util.Random;

/**
 * 问题：我想记录坦克的移动时间
 * 最简单的办法：修改代码，记录时间
 * 问题2：如果无法改变方法源码呢？
 * 用继承？
 * v05:使用代理
 * v06:代理有各种类型
 * 问题：如何实现代理的各种组合？继承？Decorator?
 * v07:代理的对象改成Movable类型-越来越像decorator了
 */

public class Tank implements Movable{

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
        Tank tank = new Tank();
        TankTimeProxy tankTimeProxy = new TankTimeProxy(tank);
        TankLogProxy tankLogProxy = new TankLogProxy(tankTimeProxy);
        tankLogProxy.move();
    }
}

class TankTimeProxy implements Movable {

    Movable movable;

    public TankTimeProxy (Movable movable) {
        this.movable  = movable;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        movable.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class TankLogProxy implements  Movable {

    Movable movable;

    public TankLogProxy (Movable movable) {
        this.movable = movable;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        movable.move();
        long end = System.currentTimeMillis();
        System.out.println("stopped!");
    }
}

interface Movable {
    void move();
}