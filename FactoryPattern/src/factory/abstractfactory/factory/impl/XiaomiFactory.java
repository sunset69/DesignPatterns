package factory.abstractfactory.factory.impl;

import factory.abstractfactory.factory.AbstractFactory;
import factory.abstractfactory.product.AbstractComputer;
import factory.abstractfactory.product.AbstractPhone;
import factory.abstractfactory.product.AbstractWatch;
import factory.abstractfactory.product.impl.XiaomiComputer;
import factory.abstractfactory.product.impl.XiaomiPhone;
import factory.abstractfactory.product.impl.XiaomiWatch;

// 具体工厂类 - 小米工厂
public class XiaomiFactory implements AbstractFactory {
    @Override
    public AbstractPhone createPhone() {
        return new XiaomiPhone();
    }
    @Override
    public AbstractComputer createComputer() {
        return new XiaomiComputer();
    }
    @Override
    public AbstractWatch createWatch() {
        return new XiaomiWatch();
    }
}
