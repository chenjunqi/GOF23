package com.bookbuf.gof23.facade.debug;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.User;
import com.bookbuf.gof23.facade.HumanComputerInteraction;

/**
 * author: robert.
 * date :  2017/2/21.
 */

public class Client {

    public static void main(String[] args) {
        // 创建交互的上下文对象 —— 即"谁与机器人在交互"。
        HumanComputerInteraction.Context context = new HumanComputerInteraction.Context(new Machine("Samu"), new User("Alice"));
        // 创建人机交互对象
        HumanComputerInteraction interaction = new HumanComputerInteraction(context);
        // 初始化人机交互
        interaction.setUp();
    }
}
