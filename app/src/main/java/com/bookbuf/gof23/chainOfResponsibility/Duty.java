package com.bookbuf.gof23.chainOfResponsibility;

import com.bookbuf.gof23.User;

/**
 * author: robert.
 * date :  2017/2/23.
 */

public abstract class Duty implements IDuty<User> {

    private Duty nextDuty;
    private Duty prevDuty;

    public Duty setNext(Duty next) {
        this.nextDuty = next;
        this.nextDuty.setPrev(this);
        return this;
    }

    protected void setPrev(Duty prev) {
        this.prevDuty = prev;
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

    public Duty moveToFirst() {
        Duty firstDuty = this;
        while (firstDuty.prevDuty != null) {
            firstDuty = firstDuty.prevDuty;
        }
        return firstDuty;
    }

    protected abstract boolean verifyImpl(User user);
}
