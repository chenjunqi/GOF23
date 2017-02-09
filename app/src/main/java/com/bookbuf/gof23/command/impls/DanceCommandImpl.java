package com.bookbuf.gof23.command.impls;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class DanceCommandImpl extends Command {

    public static final String KEY_DANCE = "跳舞";

    public DanceCommandImpl(String param) {
        super(param);
    }

    @Override
    public void excute() {
        System.out.println("调用指令 " + KEY_DANCE + param());
    }


}
