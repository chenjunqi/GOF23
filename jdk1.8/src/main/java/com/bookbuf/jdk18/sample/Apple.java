package com.bookbuf.jdk18.sample;

/**
 * author: robert.
 * date :  2017/2/16.
 */

public class Apple {

    public String color;

    public Apple(String color) {
        this.color = color;
    }

    public static boolean isGreenEquals(Apple apple) {
        return apple.color.equalsIgnoreCase("green");
    }

    public static boolean isRedEquals(Apple apple) {
        return apple.color.equalsIgnoreCase("red");
    }
}
