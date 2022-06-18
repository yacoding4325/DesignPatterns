package com.yacoding.dp.abstractfactory;

/**
 * @Author yaCoding
 * @create 2022-05-22 下午 5:28
 */

public class ModernFactory extends AbstractFactory{

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
