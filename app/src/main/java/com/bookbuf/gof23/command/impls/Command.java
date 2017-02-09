package com.bookbuf.gof23.command.impls;

import com.bookbuf.gof23.command.ICommand;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public abstract class Command implements ICommand {

    private String param;

    public Command(String param) {
        this.param = param;
    }

    protected String param() {
        return param;
    }
}
