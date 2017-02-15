package com.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangyawen on 2016/12/26 0026.
 * 购物车，负责结算
 */
public class ShoppingCar {


    private List<goods> goodsList = new ArrayList<>();

    /**
     * 添加商品到购物车
     *
     * @param goods
     */
    public void AddGoods(goods goods) {
        goodsList.add(goods);
    }

    /**
     * 移除商品
     *
     * @param goods
     */
    public void RemoveGoods(goods goods) {
        goodsList.remove(goods);
    }

    /**
     * 获取购物车中所有商品
     *
     * @return
     */
    public List<goods> getGoodsList() {
        return goodsList;
    }

    /**
     * 获取商品的基础价格【实际价格】
     * @return
     */
    public double outPrice() {
        double sum = 0;

        for (int i = 0; i < goodsList.size(); i++) {
            sum += goodsList.get(i).getPrice();
        }

        return sum;
    }
}
