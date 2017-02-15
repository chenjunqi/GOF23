package com.bookbuf.jdk18.defaults;

/**
 * author: robert.
 * date :  2017/2/15.
 */

public interface Traffic {

    default void fly() {
        System.out.println("交通工具 飞起来了!");
    }
}
