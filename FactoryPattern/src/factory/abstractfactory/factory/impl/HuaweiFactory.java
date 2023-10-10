package factory.abstractfactory.factory.impl;

import factory.abstractfactory.factory.AbstractFactory;
import factory.abstractfactory.product.AbstractComputer;
import factory.abstractfactory.product.AbstractPhone;
import factory.abstractfactory.product.AbstractWatch;
import factory.abstractfactory.product.impl.HuaweiComputer;
import factory.abstractfactory.product.impl.HuaweiPhone;
import factory.abstractfactory.product.impl.HuaweiWatch;

// 具体工厂类 - 华为工厂
public class HuaweiFactory implements AbstractFactory {
    @Override
    public AbstractPhone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public AbstractComputer createComputer() {
        return new HuaweiComputer();
    }

    @Override
    public AbstractWatch createWatch() {
        return new HuaweiWatch();
    }
}
