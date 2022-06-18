package com.yacoding.dp.Iterator.v2;


/**
 * @Author yaCoding
 * @create 2022-05-28 下午 8:33
 */

public class Main {

    public static void main(String[] args) {
        LinkedList_ list = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            list.add("s" + i);
        }
        System.out.println(list.size());
    }

}

class LinkedList_ {

    Node head = null;
    Node tail = null;
    //目前容器多少个元素
    private  int size = 0;

    public void add (Object o) {
        Node node = new Node(o);
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    class Node {
        private Object object;

        Node next;

        public Node (Object object) {
            this.object = object;
        }
    }

    public int size() {
        return size;
    }
}

