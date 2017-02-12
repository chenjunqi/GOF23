package com.bookbuf.gof23;

import com.bookbuf.gof23.strategy.IStrategy;

import java.util.HashMap;

/**
 * 机器人原胚，想象一下不长毛的人。
 * author: robert.
 * date :  2017/2/8.
 */

public class Machine {

    private String name;

    public Machine(String name) {
        this.name = name;
        System.out.println("创建了机器人 " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private HashMap<User, IStrategy> map = new HashMap<>();

    public void configure(User user, IStrategy strategy) {
        map.put(user, strategy);
    }

    public IStrategy getStrategy(User user) {
        return map.get(user);
    }


    @Override
    public String toString() {
        return name;
    }

}
