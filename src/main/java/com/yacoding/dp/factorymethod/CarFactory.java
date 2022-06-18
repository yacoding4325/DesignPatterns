package com.yacoding.dp.factorymethod;

/**
 * @Author yaCoding
 * @create 2022-05-22 上午 9:36
 */

public class CarFactory {
    public Moveable create(){
        System.out.println("a car created!");
        return new Car();
    }
}
