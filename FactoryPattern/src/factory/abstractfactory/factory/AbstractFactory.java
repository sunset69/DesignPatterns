package factory.abstractfactory.factory;

import factory.abstractfactory.product.AbstractComputer;
import factory.abstractfactory.product.AbstractPhone;
import factory.abstractfactory.product.AbstractWatch;

// 抽象工厂类
public interface AbstractFactory {
    AbstractPhone createPhone();
    AbstractComputer createComputer();
    AbstractWatch createWatch();
}
