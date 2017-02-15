package com.bookbuf.jdk18.defaults.impls;

import com.bookbuf.jdk18.defaults.Car;
import com.bookbuf.jdk18.defaults.Traffic;

/**
 * author: robert.
 * date :  2017/2/15.
 */

public class BenzCar implements Car, Traffic {
    @Override
    public void run() {
        System.out.println("奔驰车跑在路上");
    }

    @Override
    public void fly() {
        System.out.println("奔驰 飞起来啦!");
    }
}
