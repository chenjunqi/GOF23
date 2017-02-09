package com.bookbuf.gof23.decorate.impls;

import com.bookbuf.gof23.decorate.IMachineComponent;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public class ButtMachineDecorateImpl extends MachineDecorate {

    private String value;

    public ButtMachineDecorateImpl(IMachineComponent component, String value) {
        super(component);
        this.value = value;
    }

    @Override
    public void addBehaviorAfter() {
        System.out.printf("使 臀型 =%s生效%n", value);
    }

}
