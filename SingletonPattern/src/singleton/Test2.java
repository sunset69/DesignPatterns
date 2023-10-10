package singleton;


import singleton.singleton.EagerSingleton;

public class Test2 {
    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        singleton1.setName("李四");
        System.out.println(singleton1.getName());

        EagerSingleton singleton2 = EagerSingleton.getInstance();
        System.out.println(singleton2.getName());
    }
}
