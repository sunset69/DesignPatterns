package observer.impl;

import observer.observer.MyUpdate;
import observer.observer.Observer;

/**
 * 观察者
 */
public class User implements Observer {

    /**
     * 观察者信息
     */
    private String name;
    private MyUpdate myUpdate;

    public User(String name) {
        this.name = name;
    }

    public void setUpdate(MyUpdate myUpdate){
        this.myUpdate = myUpdate;
    }

    /**
     * 数据变更时处理事件
     * @param data 接受的变更后数据
     */
    @Override
    public void update(String data) {
        if (myUpdate != null){
            myUpdate.update(data);
        }
        System.out.println(name +" receive:"+ data);
    }



}
