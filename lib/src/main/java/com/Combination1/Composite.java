package com.Combination1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangyawen on 2017/1/23 0023.
 */
public class Composite extends Component {

    List<Component> list = new ArrayList<>();

    @Override
    public void add(Component c) {


        list.add(c);
    }

    @Override
    public void remove(Component c) {

        list.remove(c);


    }

    @Override
    public void eachChicld() {

        System.out.println(name + "执行了");

        for (Component c : list) {
            c.eachChicld();
        }

    }
}
