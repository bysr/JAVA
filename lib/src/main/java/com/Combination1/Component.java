package com.Combination1;

/**
 * Created by wangyawen on 2017/1/23 0023.
 */
public abstract class Component {
    /*创建一个角色名称，用来代指具体的事物*/
    String name;

    //想象一下该角色有什么任务 1 添加   2 删除   3 获取当前节点的子节点、


    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void eachChicld();


}
