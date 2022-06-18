package com.yacoding.dp.Iterator.v5;

/**
 * @Author yaCoding
 * @create 2022-05-30 上午 10:40
 */

public class LinkedList_ implements Collection_{

    Node head = null;
    Node tail = null;
    private int size = 0;


    @Override
    public void add(Object o) {
        Node node = new Node(o);
        node.next = null;
        if(head == null) {
            head = node;
            tail = node;
        }

        tail.next = node;
        tail = node;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator_ iterator() {
        return null;
    }
}

class Node {
    private Object o;
    Node next;

    public Node(Object o) {
        this.o = o;
    }
}