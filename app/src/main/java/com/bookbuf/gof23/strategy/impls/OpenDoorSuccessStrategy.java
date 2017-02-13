package com.bookbuf.gof23.strategy.impls;

import com.bookbuf.gof23.strategy.IStrategy;

/**
 * author: robert.
 * date :  2017/2/10.
 */

public class OpenDoorSuccessStrategy implements IStrategy {
    @Override
    public void operation() {
        System.out.println("验证通过，已将门打开");
    }
}
