package com.bookbuf.gof23.command;

import com.bookbuf.gof23.adapter.CommandAdapter;
import com.bookbuf.gof23.facade.HumanComputerInteraction;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class CommandReceiver {

    private Invoker invoke = new Invoker();

    public void onReceive(HumanComputerInteraction.Context context, String command, String param) {
        System.out.printf("机器人%s接收到指令：%s，%s%n", context.getMachine(), command, param);
        invoke.invoke(new CommandAdapter(command, param, context));
    }
}