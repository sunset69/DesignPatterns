package factory.factory.factory.impl;

import factory.factory.factory.AbstractFactory;
import factory.factory.product.AbstractMobile;
import factory.factory.product.impl.HuaweiMobile;

// 具体工厂类 - 华为工厂
public class HuaweiFactory implements AbstractFactory {
    @Override
    public AbstractMobile createMobile() {
        return new HuaweiMobile();
    }
}
