package com.bookbuf.gof23;

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

    @Override
    public String toString() {
        return name;
    }
}
