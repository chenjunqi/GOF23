package com.bookbuf.gof23.command.impls;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class CookCommandImpl extends Command {

    public static final String KEY_COOK = "做菜";

    public CookCommandImpl(String param) {
        super(param);
    }

    @Override
    public void excute() {
        System.out.println("调用指令 " + KEY_COOK + param());
    }
}
