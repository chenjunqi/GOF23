package com.bookbuf.gof23.decorate.debug;

import com.bookbuf.gof23.decorate.IMachineComponent;
import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.decorate.MachineComponent;
import com.bookbuf.gof23.decorate.impls.BodyMachineDecorateImpl;
import com.bookbuf.gof23.decorate.impls.ButtMachineDecorateImpl;
import com.bookbuf.gof23.decorate.impls.ChestMachineDecorateImpl;
import com.bookbuf.gof23.decorate.impls.FaceMachineDecorateImpl;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public class Client {

    public static void main(String[] args) {

        Machine machine = new Machine();

        IMachineComponent component = new MachineComponent();

        component = new FaceMachineDecorateImpl(component, "娃娃脸");
        component = new ButtMachineDecorateImpl(component, "翘臀");
        component = new ChestMachineDecorateImpl(component, "C罩杯");
        component = new BodyMachineDecorateImpl(component, "高挑纤细");

        component.invalidate(machine);
    }
}
