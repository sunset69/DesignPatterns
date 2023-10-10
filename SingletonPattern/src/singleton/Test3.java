package singleton;

import cc.lexur.design.singleton.singleton.LazySingleton;

public class Test3 implements Runnable {
    public static void main(String[] args) {
        new Thread(new Test3()).start();
        new Thread(new Test3()).start();
        new Thread(new Test3()).start();
        new Thread(new Test3()).start();
    }

    @Override
    public void run() {
        LazySingleton instance = LazySingleton.getInstance();
        instance.setName(Thread.currentThread().getName());
        System.out.println(instance.getName() + " visited:" + instance.getVisited());
    }
}
