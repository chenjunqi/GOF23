package com.bookbuf.gof23.strategy.debug;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.User;
import com.bookbuf.gof23.facade.HumanComputerInteraction;
import com.bookbuf.gof23.strategy.impls.OpenDoorFailStrategy;
import com.bookbuf.gof23.strategy.impls.OpenDoorSuccessStrategy;

/**
 * author: robert.
 * date :  2017/2/10.
 */

public class Client {

    public static void main(String[] args) {

        Machine machine = new Machine("Samu");

        // alice 开门
        User alice = new User("Alice");
        machine.configure(alice, new OpenDoorSuccessStrategy());
        HumanComputerInteraction.Context aliceContext = new HumanComputerInteraction.Context(machine, alice);
        HumanComputerInteraction aliceInteraction = new HumanComputerInteraction(aliceContext);
        aliceInteraction.setCommand("开门", null);

        // alice 爸爸开门
        User aliceParent = new User("Alice's Parent");
        machine.configure(aliceParent, new OpenDoorFailStrategy());
        HumanComputerInteraction.Context aliceParentContext = new HumanComputerInteraction.Context(machine, aliceParent);
        HumanComputerInteraction aliceParentInteraction = new HumanComputerInteraction(aliceParentContext);
        aliceParentInteraction.setCommand("开门", null);

    }
}
