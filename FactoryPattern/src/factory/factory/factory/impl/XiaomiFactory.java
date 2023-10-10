package factory.factory.factory.impl;

import factory.factory.factory.AbstractFactory;
import factory.factory.product.AbstractMobile;
import factory.factory.product.impl.XiaomiMobile;

// 具体工厂类 - 小米工厂
public class XiaomiFactory implements AbstractFactory {
    @Override
    public AbstractMobile createMobile() {
        return new XiaomiMobile();
    }
}
