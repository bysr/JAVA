package com.strategy;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangyawen on 2016/12/26 0026.
 */
public class Client {


    public static void main(String[] arg) {

        ShoppingCar sc = new ShoppingCar();

        /**这个也就是我们刚才说要研究的数据字典，其实也没啥，就是通过map对象配置打折策略，看到后面就明白了*/
        Map<String, discountStrategyImpl> map = new HashMap<>();


        //向购物车中加入商品
        sc.AddGoods(new goods("shirt", "cap", 100));
        sc.AddGoods(new goods("shirt", "sleeve", 200));
        sc.AddGoods(new goods("sports", "sp_cap", 150));
        sc.AddGoods(new goods("sports", "sp_pants", 150));
        //配置折扣策略
        map.put("shirt", new Shirt());
        map.put("sports", new Sports());
        CashierDesk cd = new CashierDesk(sc, map);
        //得到所有商品总价

        System.out.println(cd.GetTotalPrice());

        //得到所有商品折扣价

        System.out.println(cd.GetTotalDiscount());


    }

}
