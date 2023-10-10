package factory.abstractfactory.product.impl;

import factory.abstractfactory.product.AbstractComputer;

// 具体产品类 - 小米电脑
public class XiaomiComputer implements AbstractComputer {
    @Override
    public String compute() {
        return "使用小米电脑进行计算";
    }
}
