package prototype;

import prototype.prototype.Prototype;
import prototype.prototype.impl.ConcretePrototype;

public class Client {
    public static void main(String[] args) {
        Prototype jack = new ConcretePrototype("jack");
        Prototype clone = jack.clone();
        System.out.println(jack.getField());
        System.out.println(clone.getField());
    }
}
