package com.bookbuf.gof23.command;

import com.bookbuf.gof23.command.adapter.StringCommandAdapter;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class CommandManager {

    public void invoke(StringCommandAdapter adapter) {
        adapter.excute();
    }

}
