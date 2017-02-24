package com.bookbuf.gof23.chainOfResponsibility.impl;

import com.bookbuf.gof23.User;
import com.bookbuf.gof23.chainOfResponsibility.Duty;

/**
 * author: robert.
 * date :  2017/2/23.
 */

public class VerifyEmailDutyImpl extends Duty {
    @Override
    public boolean verifyImpl(User user) {
        String email = user.email;
        if (email == null) return false;
        else if (email.contains("@"))
            return true;
        return false;
    }
}
