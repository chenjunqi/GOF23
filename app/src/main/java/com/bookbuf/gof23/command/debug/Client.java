package com.bookbuf.gof23.command.debug;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.User;
import com.bookbuf.gof23.facade.HumanComputerInteraction;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class Client {

    public static void main(String args[]) {


        Machine machine = new Machine("Samu");
        User user = new User("Alice");

        HumanComputerInteraction.Context context = new HumanComputerInteraction.Context(machine, user);
        HumanComputerInteraction interaction = new HumanComputerInteraction(context);

        interaction.setCommand("唱歌", "稻香");
        interaction.setCommand("跳舞", "肚皮舞");

    }


}
