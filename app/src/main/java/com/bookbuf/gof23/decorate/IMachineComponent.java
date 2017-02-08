package com.bookbuf.gof23.decorate;

import com.bookbuf.gof23.Machine;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public interface IMachineComponent {

    /**
     * 使外观生效，比如：肤色、脸型等。
     */
    void invalidate(Machine machine);
}
