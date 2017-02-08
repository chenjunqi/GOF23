package com.bookbuf.gof23.decorate;

import com.bookbuf.gof23.Machine;

/**
 * 机器人的根组件，用于作为装饰的根。
 * author: robert.
 * date :  2017/2/8.
 */

public class MachineComponent implements IMachineComponent {

    public MachineComponent() {
        System.out.println("创建了 机器人装饰器 容器");
    }

    @Override
    public void invalidate(Machine machine) {
        System.out.println("应用装饰 到 " + machine.toString());
    }
}
