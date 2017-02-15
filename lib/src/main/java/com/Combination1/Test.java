package com.Combination1;

/**
 * Created by wangyawen on 2017/1/23 0023.
 */
public class Test {


    public static void main(String[] arg0) {

        //构造根节点

        Component root = new Composite();
        root.name = "根节点";
        //构件左边节点
        Component left = new Composite();
        left.name = "左边节点";

        //构件右边节点

        Component right = new Composite();
        right.name = "右边节点";

        Component right1 = new Composite();
        right1.name = "右边子节点1";


        Leaf right2 = new Leaf();
        right2.name = "右边子节点2";

        right.add(right1);
        right.add(right2);


        root.add(right);
        root.add(left);

        //遍历节点

        root.eachChicld();


    }

}
