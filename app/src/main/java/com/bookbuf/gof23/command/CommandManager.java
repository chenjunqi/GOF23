package com.bookbuf.gof23.command;

import com.bookbuf.gof23.User;
import com.bookbuf.gof23.adapter.CommandAdapter;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class CommandManager {

    public void invoke(User user, CommandAdapter adapter) {
        adapter.setUser(user);
        adapter.excute();
    }

}
