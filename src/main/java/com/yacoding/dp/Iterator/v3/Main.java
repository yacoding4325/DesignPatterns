package com.yacoding.dp.Iterator.v3;

/**
 * @Author yaCoding
 * @create 2022-05-30 上午 10:18
 */

/**
 * v1:构建一个容器，可以添加对象
 * v2:用链表来实现一个容器
 * v3:添加容器的共同接口，实现容器的替换
 */

public class Main {

    public static void main(String[] args) {
        ArrayList_ list = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            list.add(("s" + i));
        }
        System.out.println(list.size());

        LinkedList_ linkedList_ = new LinkedList_();
        for (int i = 0; i < 5; i++) {
            linkedList_.add(("s=" + i));
        }
        System.out.println(linkedList_.size());
    }

}
