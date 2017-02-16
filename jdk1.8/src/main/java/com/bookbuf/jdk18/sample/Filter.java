package com.bookbuf.jdk18.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * author: robert.
 * date :  2017/2/16.
 */

public class Filter {

    public static List<Apple> filter(List<Apple> collects, Predicate<Apple> predicate) {
        List<Apple> apples = new ArrayList<>();
        for (Apple ap : collects) {
            if (predicate.test(ap)) {
                apples.add(ap);
            }
        }
        return apples;
    }

    public static List<Apple> filter(List<Apple> collects, Function<Apple, Boolean> function) {
        List<Apple> apples = new ArrayList<>();
        for (Apple ap : collects) {
            if (function.apply(ap)) {
                apples.add(ap);
            }
        }
        return apples;
    }
}
