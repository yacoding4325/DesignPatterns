package com.yacoding.dp.factorymethod;

/**
 * @Author yaCoding
 * @create 2022-05-22 下午 5:15
 */

public class PlaneFactory {

    public Moveable create(){
        System.out.println("a car created!");
        return new Car();
    }
}
