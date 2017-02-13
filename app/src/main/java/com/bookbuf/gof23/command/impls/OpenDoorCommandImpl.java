package com.bookbuf.gof23.command.impls;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.User;
import com.bookbuf.gof23.command.ICommand;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class OpenDoorCommandImpl implements ICommand {

    public static final String KEY_OPEN_DOOR = "开门";

    private User user;
    private Machine machine;

    public OpenDoorCommandImpl(User user, Machine machine) {
        this.user = user;
        this.machine = machine;
    }

    @Override
    public void excute() {
        System.out.println("调用指令 " + KEY_OPEN_DOOR);
        machine.getStrategy(user).operation();
    }
}
