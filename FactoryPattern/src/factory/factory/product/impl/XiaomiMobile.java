package factory.factory.product.impl;

import factory.factory.product.AbstractMobile;

// 具体产品类 - 小米手机
public class XiaomiMobile implements AbstractMobile {
    @Override
    public void displayInfo() {
        System.out.println("这是小米手机。");
    }
}
