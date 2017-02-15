package com.bookbuf.jdk18.defaults;

/**
 * author: robert.
 * date :  2017/2/15.
 */

public interface Car {

    void run();

    // 兼容旧的接口实现，并提供飞行功能
    default void fly() {
        System.out.println(getClass().getSimpleName() + " 飞起来了！");
    }
}
