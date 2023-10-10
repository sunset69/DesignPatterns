package factory.abstractfactory.product.impl;

import factory.abstractfactory.product.AbstractWatch;

// 具体产品类 - 小米手表
public class XiaomiWatch implements AbstractWatch {
    @Override
    public String showTime() {
        return "查看小米手表时间";
    }
}
