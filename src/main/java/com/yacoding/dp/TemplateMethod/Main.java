package com.yacoding.dp.TemplateMethod;

/**
 * @Author yaCoding
 * @create 2022-05-30 下午 5:01
 */

public class Main {

    public static void main(String[] args) {
        F f = new C1();
        f.m();
        f.op1();
    }

}

abstract class F {

    public void m() {
        op1();
        op2();
    }

    abstract void op1();
    abstract void op2();

}

class C1 extends F {

    @Override
    void op1() {
        System.out.println("op1");
    }

    @Override
    void op2() {
        System.out.println("op2");
    }

}