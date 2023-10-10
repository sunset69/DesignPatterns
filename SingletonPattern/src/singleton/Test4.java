package singleton;

import cc.lexur.design.singleton.singleton.EagerSingleton;

public class Test4 implements Runnable{

    public static void main(String[] args) {
        new Thread(new Test4()).start();
        new Thread(new Test4()).start();
        new Thread(new Test4()).start();
        new Thread(new Test4()).start();

    }

    @Override
    public void run() {
        EagerSingleton instance = EagerSingleton.getInstance();
        instance.setName(Thread.currentThread().getName());
        System.out.println(instance.getName());
    }
}
