package com.bookbuf.gof23.command;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.adapter.CommandAdapter;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class SamuCommandReceiver {

    private CommandManager invoke = new CommandManager();
    private Machine machine;

    public SamuCommandReceiver(Machine machine) {
        this.machine = machine;
        System.out.printf("机器人%s的接收功能正常开启%n", machine);
    }

    public void onReceive(String command, String param) {
        System.out.printf("机器人%s接收到指令：%s，%s%n", machine, command, param);
        invoke.invoke(new CommandAdapter(command, param));
    }
}