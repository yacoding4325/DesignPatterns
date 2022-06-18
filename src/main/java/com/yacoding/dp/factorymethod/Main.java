package com.yacoding.dp.factorymethod;

public class Main {
    public static void main(String[] args) {
        Moveable m = new CarFactory().create();
        m.go();

        Moveable n = new PlaneFactory().create();
        n.go();
    }
}
