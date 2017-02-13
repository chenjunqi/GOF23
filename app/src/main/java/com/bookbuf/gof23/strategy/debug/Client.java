package com.bookbuf.gof23.strategy.debug;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.User;
import com.bookbuf.gof23.command.CommandReceiver;
import com.bookbuf.gof23.strategy.impls.OpenDoorFailStrategy;
import com.bookbuf.gof23.strategy.impls.OpenDoorSuccessStrategy;

/**
 * author: robert.
 * date :  2017/2/10.
 */

public class Client {

    public static void main(String[] args) {
        User alice = new User("Alice");
        User aliceParent = new User("Alice's Parent");


        Machine machine = new Machine("Samu");
        machine.configure(alice, new OpenDoorSuccessStrategy());
        machine.configure(aliceParent, new OpenDoorFailStrategy());


        CommandReceiver receiver = new CommandReceiver(machine);
        receiver.onReceive(alice, "开门", null);
        receiver.onReceive(aliceParent, "开门", null);

    }
}
