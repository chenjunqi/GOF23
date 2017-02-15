package com.bookbuf.jdk18.defaults.debug;

import com.bookbuf.jdk18.defaults.Car;
import com.bookbuf.jdk18.defaults.impls.AudiCar;
import com.bookbuf.jdk18.defaults.impls.BMWCar;
import com.bookbuf.jdk18.defaults.impls.BenzCar;

/**
 * author: robert.
 * date :  2017/2/15.
 */

public class Client {

    public static void main(String[] args) {

        Car car = new BenzCar();
        car.fly();

        car = new BMWCar();
        car.fly();

        car = new AudiCar();
        car.fly();
    }
}
