package com.strategy;

import java.util.Dictionary;
import java.util.Map;

/**
 * 收银台
 * Created by wangyawen on 2016/12/26 0026.
 */
public class CashierDesk {

    /*购物车*/
    private ShoppingCar car;
    /*数据字典，等会研究一下这玩意*/
    private Map<String, discountStrategyImpl> strategies;

    public CashierDesk(ShoppingCar car, Map<String, discountStrategyImpl> s) {
        this.car = car;
        this.strategies = s;
    }

    /**
     * 商品总价
     *
     * @return
     */
    public double GetTotalPrice() {

        return car.outPrice();

    }

    /**
     * 商品实际价格
     *
     * @return
     */
    public double GetTotalDiscount() {
        double sum = 0;
        /*定义一个接口引用对象*/
        discountStrategyImpl idiscountStrategy;
        for (goods g : car.getGoodsList()) {

            /*拿到具体的执行策略*/
            idiscountStrategy = strategies.get(g.getType());
            if (idiscountStrategy != null) {
                sum += idiscountStrategy.GetDiscount(g);
            }
        }
        return sum;

    }


}
