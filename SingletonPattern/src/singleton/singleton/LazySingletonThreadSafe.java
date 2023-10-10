package singleton.singleton;

/**
 * 懒汉式 单例
 */
public class LazySingletonThreadSafe {

    /**
     * 静态成员变量，唯一实例
     */
    private static LazySingletonThreadSafe instance;

    // ... 其他成员变量
    private String name;

    private int visited = 0;

    /**
     * 私有构造，保证唯一实例
     */
    private LazySingletonThreadSafe() {
    }

    /**
     * 获取实例
     * 懒汉式,当第一次获取时实例化
     *
     * @return 唯一实例
     */
    public static LazySingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (LazySingletonThreadSafe.class){
                instance = new LazySingletonThreadSafe();
            }
        }
        instance.visited++;
        System.out.println("visited:" + instance.visited);
        return instance;
    }

    // ...其他成员方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisited() {
        return visited;
    }

}
