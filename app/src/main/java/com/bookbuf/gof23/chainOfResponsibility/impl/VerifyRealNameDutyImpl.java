package com.bookbuf.gof23.chainOfResponsibility.impl;

import com.bookbuf.gof23.User;
import com.bookbuf.gof23.chainOfResponsibility.Duty;

/**
 * author: robert.
 * date :  2017/2/23.
 */

public class VerifyRealNameDutyImpl extends Duty {
    @Override
    public boolean verifyImpl(User user) {
        String string = user.name;
        if (string == null) {
            return false;
        } else {
            if (string.length() > 4 && string.length() < 10)
                return true;
            return false;
        }
    }

}
