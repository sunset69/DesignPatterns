package singleton.singleton;

/**
 * 懒汉式 单例
 */
public class EagerSingleton {

    /**
     * 静态成员变量，唯一实例
     */
    private static EagerSingleton instance = new EagerSingleton();

    // ... 其他成员变量
    private String name;

    private int visited = 0;


    /**
     * 私有构造，保证唯一实例
     */
    private EagerSingleton() {}

    /**
     * 获取实例
     * 饿汉模式，在程序启动时创建
     *
     * @return 唯一实例
     */
    public static EagerSingleton getInstance() {
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
