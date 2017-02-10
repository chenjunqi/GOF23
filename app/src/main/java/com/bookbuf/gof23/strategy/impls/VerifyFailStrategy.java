package com.bookbuf.gof23.strategy.impls;

import com.bookbuf.gof23.strategy.IOpenDoorStrategy;

/**
 * author: robert.
 * date :  2017/2/10.
 */

public class VerifyFailStrategy implements IOpenDoorStrategy {
    @Override
    public void operation() {
        System.out.println("验证失败，无法为您开门");
    }
}
