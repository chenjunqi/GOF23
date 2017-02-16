package com.bookbuf.jdk18.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * author: robert.
 * date :  2017/2/16.
 */

public class Client {

    public static void main(String[] args) {
        Apple red = new Apple("red");
        Apple green = new Apple("green");
        Apple blue = new Apple("blue");

        List<Apple> apples = new ArrayList<>();
        apples.add(red);
        apples.add(green);
        apples.add(blue);

        List<Apple> filters = Filter.filter(apples, Apple::isGreenEquals);
        System.out.println(filters.size());
    }
}
