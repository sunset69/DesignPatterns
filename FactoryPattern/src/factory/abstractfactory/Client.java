package factory.abstractfactory;

import factory.abstractfactory.factory.AbstractFactory;
import factory.abstractfactory.factory.impl.HuaweiFactory;
import factory.abstractfactory.factory.impl.XiaomiFactory;
import factory.abstractfactory.product.AbstractComputer;
import factory.abstractfactory.product.AbstractPhone;
import factory.abstractfactory.product.AbstractWatch;

public class Client {
    public static void main(String[] args) {
        AbstractFactory xiaomiFactory = new XiaomiFactory();
        AbstractFactory huaweiFactory = new HuaweiFactory();

        AbstractPhone xiaomiPhone = xiaomiFactory.createPhone();
        AbstractComputer xiaomiComputer = xiaomiFactory.createComputer();
        AbstractWatch xiaomiWatch = xiaomiFactory.createWatch();
        System.out.println(xiaomiPhone.makeCall());
        System.out.println(xiaomiComputer.compute());
        System.out.println(xiaomiWatch.showTime());

        AbstractPhone huaweiPhone = huaweiFactory.createPhone();
        AbstractComputer huaweiComputer = huaweiFactory.createComputer();
        AbstractWatch huaweiWatch = huaweiFactory.createWatch();
        System.out.println(huaweiPhone.makeCall());
        System.out.println(huaweiComputer.compute());
        System.out.println(huaweiWatch.showTime());

    }
}
