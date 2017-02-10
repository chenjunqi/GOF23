package com.bookbuf.gof23.command.impls;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.User;
import com.bookbuf.gof23.command.ICommand;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class OpenDoorCommandImpl implements ICommand {

    private User user;
    private Machine machine;

    public OpenDoorCommandImpl(User user, Machine machine) {
        this.user = user;
        this.machine = machine;
    }

    @Override
    public void excute() {
        machine.getStrategy(user).operation();
    }
}
