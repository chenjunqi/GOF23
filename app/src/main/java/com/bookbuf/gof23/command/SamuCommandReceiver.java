package com.bookbuf.gof23.command;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.MachineCommandReceiver;
import com.bookbuf.gof23.command.adapter.StringCommandAdapter;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class SamuCommandReceiver implements MachineCommandReceiver {

    private Invoke invoke = new Invoke();
    private Machine machine;

    public SamuCommandReceiver(Machine machine) {
        this.machine = machine;
        System.out.printf("机器人%s的接收功能正常开启%n", machine);
    }

    @Override
    public void onReceive(String command, String param) {
        System.out.printf("机器人%s接收到指令：%s，%s%n", machine, command, param);
        invoke.invoke(new StringCommandAdapter(command, param));
    }
}