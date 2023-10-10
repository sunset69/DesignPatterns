package factory.factory;


import factory.factory.factory.AbstractFactory;
import factory.factory.factory.impl.HuaweiFactory;
import factory.factory.factory.impl.XiaomiFactory;
import factory.factory.product.AbstractMobile;

public class Client {
    public static void main(String[] args) {
        // 使用具体工厂创建具体产品
        AbstractFactory xiaomiFactory =  new XiaomiFactory();
        AbstractMobile xiaomiMobile = xiaomiFactory.createMobile();
        xiaomiMobile.displayInfo();

        AbstractFactory huaweiFactory = new HuaweiFactory();
        AbstractMobile huaweiMobile = huaweiFactory.createMobile();
        huaweiMobile.displayInfo();
    }
}
