package factory.abstractfactory.product.impl;

import factory.abstractfactory.product.AbstractComputer;

// 具体产品类 - 华为电脑
public class HuaweiComputer implements AbstractComputer {
    @Override
    public String compute() {
        return "使用华为电脑进行计算";
    }
}
