package com.bookbuf.gof23.prototype;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.Predicate;

/**
 * author: robert.
 * date :  2017/2/17.
 */

public class ProtoObject implements IPrototype, Cloneable {

    // 克隆的原型对象
    private ProtoObject cloneProto;

    public ProtoObject(/* 继承的对象 */ProtoObject cloneProto) {
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

    public void invoke(String methodString) {
        IPrototype proto = __constructor__();
        Class<?> cls;
        System.out.printf(" 查找 原型链 + (%s)%n", methodString);
        while (proto != null) {
            cls = proto.getClass();
            if (pickInvoke(cls, proto, methodString, (Method method) -> (method != null))) {
                break;
            }
            proto = proto.__proto__();

        }
        System.out.printf(" 查找 原型链 - (%s)%n", methodString);
    }

    @Override
    protected ProtoObject clone() throws CloneNotSupportedException {
        return (ProtoObject) super.clone();
    }

    public void printChain() {
        System.out.println("打印原型链 +");
        IPrototype proto = __constructor__();
        while (proto != null) {
            System.out.println(proto.__constructor__().getClass());
            proto = proto.__proto__();
        }
        System.out.println("打印原型链 -");
    }

    private boolean pickInvoke(Class<?> cls, IPrototype proto, String methodString, Predicate<Method> predicate) {


        Method method = pickMethod(cls, methodString::equalsIgnoreCase);
        if (predicate.test(method)) {
            System.out.println("当前输入类型" + cls.getSimpleName() + "，结果匹配成功 ");
            try {
                method.invoke(proto);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            return true;
        } else {
            System.out.println("当前输入类型" + cls.getSimpleName() + "，结果匹配失败 ");
            return false;
        }
    }

    public Method pickMethod(Class<?> cls, Predicate<String> predicate) {
        Method[] methods = cls.getMethods();
        if (methods == null) return null;
        if (methods.length == 0) return null;
        for (Method m : methods) {
            if (predicate.test(m.getName())) {
                return m;
            }
        }
        return null;
    }

}
