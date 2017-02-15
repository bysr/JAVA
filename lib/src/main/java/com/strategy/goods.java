package com.strategy;

/**
 * Created by wangyawen on 2016/12/26 0026.
 * 定义一个商品，里面包含商品类型，商品名称，商品价格
 */
public class goods {

    String Type;
    String Name;
    double Price;


    public goods(String type, String name, double price) {
        Type = type;
        Name = name;
        Price = price;
    }

    @Override
    public String toString() {
        return "goods{" +
                "Type='" + Type + '\'' +
                ", Name='" + Name + '\'' +
                ", Price=" + Price +
                '}';
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getType() {
        return Type;
    }

    public String getName() {
        return Name;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setName(String name) {
        Name = name;
    }

}
