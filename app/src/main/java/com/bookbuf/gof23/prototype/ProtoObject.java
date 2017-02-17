package com.bookbuf.gof23.prototype;

/**
 * author: robert.
 * date :  2017/2/17.
 */

public class ProtoObject implements IPrototype, Cloneable {

    // 克隆的原型对象
    private ProtoObject cloneProto;

    public ProtoObject(ProtoObject cloneProto) {
        if (cloneProto == null) {
            this.cloneProto = null;
        } else {
            try {
                this.cloneProto = cloneProto.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public IPrototype __proto__() {
        return cloneProto;
    }

    @Override
    public IPrototype __constructor__() {
        return this;
    }

    public void invoke(String method) {
        IPrototype proto = cloneProto;
        while (proto != null) {
            System.out.println(proto.getClass().getSimpleName());
            proto = proto.__proto__();
        }
    }

    @Override
    protected ProtoObject clone() throws CloneNotSupportedException {
        return (ProtoObject) super.clone();
    }
}
