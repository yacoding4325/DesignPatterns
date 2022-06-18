package com.yacoding.dp.abstractfactory;

/**
 * @Author yaCoding
 * @create 2022-05-22 下午 5:24
 */

public abstract class AbstractFactory {

    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
