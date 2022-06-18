package com.yacoding.dp.Iterator.v6;

/**
 * @Author yaCoding
 * @create 2022-05-30 上午 11:01
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * v1:构建一个容器，可以添加对象
 * v2:用链表来实现一个容器
 * v3:添加容器的共同接口，实现容器的替换
 * v4:如何对容器遍历呢？
 * v4:用一种统一的遍历方式，要求每一个容器都要提供Iterator的实现类
 *    作业：实现LinkedList的Iterator
 * v6:JDK的容器的Iterator
 */

public class Main {

    public static void main(String[] args) {
        Collection collection = new ArrayList();
        for (int i = 0; i < 10; i++) {
            collection.add("s"+i);
            System.out.println(i);
        }
//        System.out.println("最终collection="+collection);

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
