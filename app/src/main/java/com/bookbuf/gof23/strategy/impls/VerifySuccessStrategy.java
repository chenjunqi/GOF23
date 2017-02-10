package com.bookbuf.gof23.strategy.impls;

import com.bookbuf.gof23.strategy.IOpenDoorStrategy;

/**
 * author: robert.
 * date :  2017/2/10.
 */

public class VerifySuccessStrategy implements IOpenDoorStrategy {
    @Override
    public void operation() {
        System.out.println("验证通过，已将门打开");
    }
}
