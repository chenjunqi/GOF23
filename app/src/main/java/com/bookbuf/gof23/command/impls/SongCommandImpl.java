package com.bookbuf.gof23.command.impls;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.command.ICommand;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class SongCommandImpl implements ICommand {

    public static final String KEY_SONG = "唱歌";

    @Override
    public void excute(Machine machine, String param) {
        System.out.printf("%s 正在唱歌 %s%n", machine, param);
    }
}
