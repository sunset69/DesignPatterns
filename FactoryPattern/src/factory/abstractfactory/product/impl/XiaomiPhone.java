package factory.abstractfactory.product.impl;

import factory.abstractfactory.product.AbstractPhone;

// 具体产品类 - 小米手机
public class XiaomiPhone implements AbstractPhone {
    @Override
    public String makeCall() {
        return "使用小米手机打电话";
    }
}
