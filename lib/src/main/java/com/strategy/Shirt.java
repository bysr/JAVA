package com.strategy;

/**
 * 衬衫打折策略
 * Created by wangyawen on 2016/12/26 0026.
 */
public class Shirt implements discountStrategyImpl {
    @Override
    public double GetDiscount(goods goods) {
        return 0.9 * goods.getPrice();
    }
}
