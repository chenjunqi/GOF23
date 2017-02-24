package com.bookbuf.gof23.chainOfResponsibility.impl;

import com.bookbuf.gof23.User;
import com.bookbuf.gof23.chainOfResponsibility.Duty;

/**
 * author: robert.
 * date :  2017/2/23.
 */

public class VerifyPasswordDutyImpl extends Duty {

    @Override
    protected boolean verifyImpl(User user) {
        String string = user.password;
        if (string == null)
            return false;
        else if (string.length() > 6)
            return true;
        return false;
    }
}
