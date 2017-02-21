package com.bookbuf.gof23.command.impls;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.User;
import com.bookbuf.gof23.facade.HumanComputerInteraction;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class OpenDoorCommandImpl extends Command {

    public static final String KEY_OPEN_DOOR = "开门";

    private HumanComputerInteraction.Context context;

    public OpenDoorCommandImpl(String param, HumanComputerInteraction.Context context) {
        super(param);
        this.context = context;
    }

    @Override
    public void excute() {
        System.out.println("调用指令 " + KEY_OPEN_DOOR);
        if (this.context == null) {
            System.err.println("user is null.");
        }
        final Machine machine = context.getMachine();
        final User user = context.getUser();
        machine.getStrategy(user).operation();
    }
}
