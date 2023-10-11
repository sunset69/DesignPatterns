package prototype;

import prototype.data.User;
import prototype.prototype.DefaultPrototype;

/**
 * 测试使用原生clone方法, 验证浅拷贝
 */
public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        DefaultPrototype defaultPrototype = new DefaultPrototype();
        defaultPrototype.setId(1);
        User user = new User();
        user.setName("jack");
        user.setAge(11);
        defaultPrototype.setUser(user);
        System.out.println("default:" + defaultPrototype.getId());
        System.out.println("default:" + defaultPrototype.getUser());


        DefaultPrototype clone = defaultPrototype.clone();
        System.out.println("clone:" + clone.getId());
        System.out.println("clone:" + clone.getUser());
        System.out.println("====================");

        user.setName("changed user");
        defaultPrototype.setId(11);

        System.out.println("default:" + defaultPrototype.getId());
        System.out.println("default:" + defaultPrototype.getUser());
        System.out.println("clone:" + clone.getId());
        System.out.println("clone:" + clone.getUser());//因为默认是浅拷贝，所以user被同步修改了
        System.out.println("====================");

    }
}
