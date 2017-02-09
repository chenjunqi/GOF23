package com.bookbuf.gof23.decorate.impls;

import com.bookbuf.gof23.decorate.IMachineComponent;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public class FaceMachineDecorateImpl extends MachineDecorate {

    private String value;

    public FaceMachineDecorateImpl(IMachineComponent component, String value) {
        super(component);
        this.value = value;
    }

    @Override
    public void addBehaviorAfter() {
        System.out.printf("使 脸型 =%s生效%n", value);
    }

}
