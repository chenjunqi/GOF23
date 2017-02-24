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

        if (next == null) throw new IllegalArgumentException("duty can not be null.");

        Duty temp = moveToLast();

        temp.nextDuty = next;
        next.prevDuty = temp;

        return next;
    }

    @Override
    public final boolean verify(User user) {
        final boolean bool = verifyImpl(user);
        System.out.println("[" + getClass().getSimpleName() + "] verify :" + bool);
        if (!bool) {
            debugPrint(bool);
            return bool;
        } else {
            if (nextDuty != null) {
                return nextDuty.verify(user);
            } else {
                debugPrint(bool);
                return bool;
            }
        }
    }

    private void debugPrint(boolean bool) {
        if (!bool)
            System.out.println("[" + getClass().getSimpleName() + "] 被迫终止");
        else
            System.out.println("[" + getClass().getSimpleName() + "] 恭喜校验通过");
    }

    public Duty moveToFirst() {
        Duty firstDuty = this;
        while (firstDuty.prevDuty != null) {
            firstDuty = firstDuty.prevDuty;
        }
        return firstDuty;
    }

    public Duty moveToLast() {
        Duty lastDuty = this;
        while (lastDuty.nextDuty != null) {
            lastDuty = nextDuty.prevDuty;
        }
        return lastDuty;
    }

    protected abstract boolean verifyImpl(User user);
}
