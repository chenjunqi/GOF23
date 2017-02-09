package com.bookbuf.gof23.decorate.impls;

import com.bookbuf.gof23.decorate.IMachineComponent;
import com.bookbuf.gof23.Machine;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public abstract class MachineDecorate implements IMachineComponent {

    private IMachineComponent component;

    public MachineDecorate(IMachineComponent component) {
        this.component = component;
        System.out.println(getClass().getSimpleName() + " 包装：" + component.getClass().getSimpleName());
    }

    @Override
    public final void invalidate(Machine machine) {
        this.component.invalidate(machine);
        addBehaviorAfter();
    }

    public abstract void addBehaviorAfter();
}
