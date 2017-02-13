package com.bookbuf.gof23.command;

import com.bookbuf.gof23.adapter.CommandAdapter;
import com.bookbuf.gof23.command.impls.OpenDoorCommandImpl;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class CommandManager {

    public void invoke(CommandAdapter adapter) {
        adapter.excute();
    }

    public void invoke(OpenDoorCommandImpl command) {
        command.excute();
    }
}
