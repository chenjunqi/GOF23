package com.bookbuf.gof23.command.debug;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.User;
import com.bookbuf.gof23.command.CommandReceiver;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class Client {

    public static void main(String args[]) {


        Machine machine = new Machine("Samu");
        User user = new User("Alice");

        CommandReceiver receiver = new CommandReceiver(machine);

        receiver.onReceive(user, "唱歌", "稻香");
        receiver.onReceive(user, "跳舞", "肚皮舞");
    }


}
