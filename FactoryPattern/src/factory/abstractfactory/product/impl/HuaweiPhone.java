package factory.abstractfactory.product.impl;

import factory.abstractfactory.product.AbstractPhone;

// 具体产品类 - 华为手机
public class HuaweiPhone implements AbstractPhone {
    @Override
    public String makeCall() {
        return "使用华为手机打电话";
    }
}
