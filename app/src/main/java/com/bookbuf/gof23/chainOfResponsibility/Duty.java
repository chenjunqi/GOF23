package com.bookbuf.gof23.chainOfResponsibility;

import com.bookbuf.gof23.User;

/**
 * author: robert.
 * date :  2017/2/23.
 */

public abstract class Duty implements IDuty<User> {

    private Duty nextDuty;

    public void setNext(Duty next) {
        this.nextDuty = next;
    }


    @Override
    public final boolean verify(User user) {
        final boolean bool = verifyImpl(user);
        if (!bool) {
            return bool;
        } else {
            if (nextDuty != null)
                return nextDuty.verify(user);
            return bool;
        }
    }

    protected abstract boolean verifyImpl(User user);
}
