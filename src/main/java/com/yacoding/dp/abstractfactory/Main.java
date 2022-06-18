package com.yacoding.dp.abstractfactory;

/**
 * @Author yaCoding
 * @create 2022-05-22 下午 5:20
 */

public class Main {

    public static void main(String[] args) {
        AbstractFactory f = new ModernFactory();
        Vehicle c = f.createVehicle();
        c.go();
        Weapon w = f.createWeapon();
        w.shoot();
        Food b = f.createFood();
        b.printName();
    }

}