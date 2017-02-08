package com.bookbuf.gof23.decorate.decorateImpls;

import com.bookbuf.gof23.decorate.IMachineComponent;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public class BodyMachineDecorateImpl extends MachineDecorate {

    private String value;

    public BodyMachineDecorateImpl(IMachineComponent component, String value) {
        super(component);
        this.value = value;
    }

    @Override
    public void addBehaviorAfter() {
        System.out.printf("使 体型 =%s生效%n", value);
    }

}
