package com.yacoding.dp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yaCoding
 * @create 2022-05-28 上午 10:50
 */

public class Main {

    public static void main(String[] args) {
        BranchNode branchNode = new BranchNode("branchNode");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        Node node1 = new LeafNode("node1");
        Node node2 = new LeafNode("node2");
        Node node3 = new LeafNode("node3");

        BranchNode branchNode1 = new BranchNode("branchNode1");
        Node node4 = new LeafNode("node4");
        Node node5 = new LeafNode("node5");

        branchNode.add(chapter1);
        branchNode.add(chapter2);
        branchNode.add(node1);
        chapter1.add(node2);
        chapter1.add(node3);
        chapter2.add(branchNode1);
        branchNode1.add(node4);
        branchNode1.add(node5);
        tree(branchNode,0);
    }

    private static void tree(Node a, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.println("---");
        }
        a.p();
        if (a instanceof BranchNode) {
            for (Node node :((BranchNode)a).nodes) {
                tree(node,depth+1);
            }
            System.out.println("=========");
        }
    }
}

abstract class Node {
    abstract public void p();
}

class LeafNode extends Node {

    String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void p() {
        System.out.println("p()方法...");
    }

}

class BranchNode extends Node {

    List<Node> nodes = new ArrayList<>();

    String name;

    public BranchNode (String name) {
        this.name = name;
    }

    @Override
    public void p() {
        System.out.println(name);
    }

    public void add(Node node) {
        nodes.add(node);
    }

}