package com.bookbuf.gof23.command.impls;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class SongCommandImpl extends Command {

    public static final String KEY_SONG = "唱歌";

    public SongCommandImpl(String param) {
        super(param);
    }

    @Override
    public void excute() {
        System.out.println("调用指令 " + KEY_SONG + param());
    }
}
