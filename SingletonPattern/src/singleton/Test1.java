package singleton;

import cc.lexur.design.singleton.singleton.LazySingleton;

public class Test1 {
    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getInstance();
        singleton1.setName("张三");
        System.out.println(singleton1.getName());

        LazySingleton singleton2 = LazySingleton.getInstance();
        System.out.println(singleton2.getName());
    }
}
