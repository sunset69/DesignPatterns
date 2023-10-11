package prototype.prototype.impl;

import prototype.prototype.Prototype;

public class ConcretePrototype implements Prototype {
    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    public Prototype clone() {
        // 需要注意浅拷贝与深拷贝问题
        return new ConcretePrototype(this.field);
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

}
