package com.yacoding.dp.ASM;

/**
 * @Author yaCoding
 * @create 2022-05-30 下午 3:29
 */

public class MyClassLoader extends ClassLoader{

    public Class defineClass(String name, byte[] b) {
        return defineClass(name, b, 0, b.length);
    }

}
