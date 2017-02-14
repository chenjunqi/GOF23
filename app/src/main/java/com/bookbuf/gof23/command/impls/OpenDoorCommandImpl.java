package com.bookbuf.gof23.command.impls;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.User;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class OpenDoorCommandImpl extends Command {

    public static final String KEY_OPEN_DOOR = "开门";

    private User user;
    private Machine machine;

    public OpenDoorCommandImpl(String param, User user, Machine machine) {
        super(param);
        this.user = user;
        this.machine = machine;
    }

    @Override
    public void excute() {
        System.out.println("调用指令 " + KEY_OPEN_DOOR);
        if (this.user == null) {
            System.err.println("user is null.");
        }
        if (this.machine == null) {
            System.err.println("machine is null.");
        }
        machine.getStrategy(user).operation();
    }
}
