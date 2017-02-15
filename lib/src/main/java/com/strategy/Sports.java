package com.strategy;

/**
 * Created by wangyawen on 2016/12/26 0026.
 * 运动鞋打折策略
 */
public class Sports implements discountStrategyImpl {
    @Override
    public double GetDiscount(goods goods) {
        return 0.8 * goods.getPrice();
    }
}
