package com.Combination;

import java.util.Enumeration;
import java.util.Vector;

import sun.reflect.generics.tree.Tree;

/**
 * Created by wangyawen on 2017/1/19 0019.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;

    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    /**
     * 添加一个节点
     *
     * @param treeNode
     */
    public void add(TreeNode treeNode) {

        children.add(treeNode);

    }

    /**
     * 删除一个节点
     *
     * @param treeNode
     */
    public void remove(TreeNode treeNode) {

        children.remove(treeNode);

    }

    /**
     * Enumeration接口
     * Enumeration接口本身不是一个数据结构。但是，对其他数据结构非常重要。 Enumeration接口定义了从一个数据结构得到连续数据的手段。例如，Enumeration定义了一个名为nextElement的方法，可以用来从含有多个元素的数据结构中得到的下一个元素。
     * Enumeration接口提供了一套标准的方法，由于Enumeration是一个接口，它的角色局限于为数据结构提供方法协议。
     *
     * @return 获取子节点
     */
    public Enumeration<TreeNode> getChildren() {

        return children.elements();


    }


}
