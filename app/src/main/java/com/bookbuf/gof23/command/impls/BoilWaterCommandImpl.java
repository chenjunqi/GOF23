package com.bookbuf.gof23.command.impls;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class BoilWaterCommandImpl extends Command {

    public static final String KEY_BOIL_WATER = "烧水";

    public BoilWaterCommandImpl(String param) {
        super(param);
    }

    @Override
    public void excute() {
        System.out.println("调用指令 " + KEY_BOIL_WATER + param());
    }
}
