package com.yacoding.dp.state.v2;

/**
 * @Author yaCoding
 * @create 2022-05-30 下午 5:08
 */

public class MM {

    String name;
    MMState state = new MMHappyState();


    public void smile() {
        state.smile();
    }

    public void cry() {
        state.cry();
    }

    public void say() {
        state.say();
    }

}
