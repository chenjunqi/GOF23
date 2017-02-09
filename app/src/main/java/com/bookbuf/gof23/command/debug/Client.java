package com.bookbuf.gof23.command.debug;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.MachineCommandReceiver;
import com.bookbuf.gof23.command.Invoke;

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

    public static class SamuCommandReceiver implements MachineCommandReceiver {

        Invoke invoke = new Invoke();
        Machine machine;

        public SamuCommandReceiver(Machine machine) {
            this.machine = machine;
            System.out.printf("机器人%s的接收功能正常开启%n", machine);
        }

        @Override
        public void onReceive(String command, String param) {
            System.out.printf("机器人%s接收到指令：%s，%s%n", machine, command, param);
            invoke.invoke(machine, command, param);
        }
    }
}
