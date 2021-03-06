//package com.bookbuf.gof23.prototype;
//
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//
///**
// * author: robert.
// * date :  2017/2/17.
// */
//
//public interface IPrototype {
//
//    // 原型对象（即它的父类对象）
//    IPrototype __proto__();
//
//    // 自身构造器
//    IPrototype __constructor__();
//
//    // 定义ProtoTypeInherits方法的目的是为了演示，通过 原型链的"对象继承"
//    @Target({ElementType.METHOD})
//    @Retention(RetentionPolicy.RUNTIME)
//    @interface ProtoTypeInherits {
//
//    }
//}
