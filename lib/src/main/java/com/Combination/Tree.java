package com.Combination;

import java.util.Enumeration;

/**
 * Created by wangyawen on 2017/1/19 0019.
 */
public class Tree {

    TreeNode root = null;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }


    public static void main(String[] arg0) {

        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);

        System.out.println("build the tree finished!");

        Enumeration t = tree.root.getChildren();


        while (t.hasMoreElements()) {
            System.out.println(t.nextElement());
        }


    }


}
