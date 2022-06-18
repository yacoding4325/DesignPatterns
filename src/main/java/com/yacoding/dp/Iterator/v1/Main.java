package com.yacoding.dp.Iterator.v1;

/**
 * @Author yaCoding
 * @create 2022-05-28 下午 8:26
 */

public class Main {
    public static void main(String[] args) {
        ArrayList_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add("s" + i);
        }
        System.out.println(list.size());
    }
}

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class ArrayList_ {
    Object [] objects = new Object[10];
    private int index = 0;

    public void add(Object o) {
        if(index == objects.length) {
            Object[] newObjects = new Object[objects.length *2];
            System.arraycopy(objects,0, newObjects,0, objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index ++;
    }

    public int size() {
        return index;
    }
}