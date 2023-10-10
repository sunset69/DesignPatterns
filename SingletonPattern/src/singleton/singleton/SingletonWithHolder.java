package singleton.singleton;

/**
 * 参考：https://blog.csdn.net/yuyeqianhen/article/details/91045338
 */

public class SingletonWithHolder {
    private static class SingletonHolder {
        //在类第一次被使用时被加载（记住，是一次使用，不一定是实例化）。
        // 参考：https://www.cnblogs.com/maohuidong/p/7843807.html
        public final static SingletonWithHolder instance = new SingletonWithHolder();
    }

    public static SingletonWithHolder getInstance() {
        return SingletonHolder.instance;
    }
}
