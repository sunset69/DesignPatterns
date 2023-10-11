package prototype.prototype;

import prototype.data.User;

// 使用默认方法进行克隆
public class DefaultPrototype implements Cloneable{

    private int id;

    private User user;

    public DefaultPrototype() {
    }

    public DefaultPrototype(int id, User user) {
        this.id = id;
        this.user = user;
    }

    @Override
    public DefaultPrototype clone() throws CloneNotSupportedException {
        return (DefaultPrototype) super.clone();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
