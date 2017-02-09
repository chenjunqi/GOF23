package com.bookbuf.gof23.command.debug;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.command.SamuCommandReceiver;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class Client {

    public static void main(String args[]) {


        Machine machine = new Machine("Samu");

        SamuCommandReceiver receiver = new SamuCommandReceiver(machine);

        receiver.onReceive("唱歌", "稻香");
        receiver.onReceive("跳舞", "肚皮舞");
    }


}
