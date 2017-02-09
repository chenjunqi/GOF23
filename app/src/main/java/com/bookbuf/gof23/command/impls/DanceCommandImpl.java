package com.bookbuf.gof23.command.impls;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.command.ICommand;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class DanceCommandImpl implements ICommand {

    public static final String KEY_DANCE = "跳舞";

    @Override
    public void excute(Machine machine, String param) {
        System.out.printf("%s 正在跳舞 %s%n", machine, param);
    }
}
