package com.bookbuf.gof23.adapter;

import com.bookbuf.gof23.command.ICommand;
import com.bookbuf.gof23.command.impls.Command;
import com.bookbuf.gof23.facade.HumanComputerInteraction;
import com.bookbuf.gof23.simple_factory.CommandSimpleFactory;

// 适配类：用于适配ICommand接口
public class CommandAdapter implements ICommand {

    private String method;
    private String param;
    private HumanComputerInteraction.Context context;

    public CommandAdapter(String method, String param, HumanComputerInteraction.Context context) {
        this.method = method;
        this.param = param;
        this.context = context;
    }

    @Override
    public void excute() {
        System.out.println("调用指令：" + toString());
        Command command = (Command) CommandSimpleFactory.createCommand(context, this.method, this.param);
        command.excute();
    }

    @Override
    public String toString() {
        return "CommandAdapter{" +
                "method='" + method + '\'' +
                ", param='" + param + '\'' +
                '}';
    }
}
