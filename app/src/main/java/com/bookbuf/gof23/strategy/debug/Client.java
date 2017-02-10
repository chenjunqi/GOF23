package com.bookbuf.gof23.strategy.debug;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.User;
import com.bookbuf.gof23.command.OpenDoorCommandReceiver;
import com.bookbuf.gof23.strategy.impls.VerifyFailStrategy;
import com.bookbuf.gof23.strategy.impls.VerifySuccessStrategy;

/**
 * author: robert.
 * date :  2017/2/10.
 */

public class Client {

    public static void main(String[] args) {
        User alice = new User("Alice");
        User aliceParent = new User("Alice's Parent");


        Machine machine = new Machine("Samu");
        machine.configure(alice, new VerifySuccessStrategy());
        machine.configure(aliceParent, new VerifyFailStrategy());


        OpenDoorCommandReceiver receiver = new OpenDoorCommandReceiver(machine);
        System.out.println("++aliceParent++");
        receiver.onReceive("开门", aliceParent);
        System.out.println("--aliceParent--");
        System.out.println("++alice++");
        receiver.onReceive("开门", alice);
        System.out.println("--alice--");

    }
}
