package factory.factory.product.impl;

import factory.factory.product.AbstractMobile;

// 具体产品类 - 华为手机
public class HuaweiMobile implements AbstractMobile {
    @Override
    public void displayInfo() {
        System.out.println("这是华为手机。");
    }
}
