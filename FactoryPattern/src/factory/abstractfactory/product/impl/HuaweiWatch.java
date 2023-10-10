package factory.abstractfactory.product.impl;

import factory.abstractfactory.product.AbstractWatch;

// 具体产品类 - 华为手表
public class HuaweiWatch implements AbstractWatch {
    @Override
    public String showTime() {
        return "查看华为手表时间";
    }
}
