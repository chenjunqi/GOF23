package com.bookbuf.gof23.chainOfResponsibility.impl;

import com.bookbuf.gof23.User;
import com.bookbuf.gof23.chainOfResponsibility.Duty;

/**
 * author: robert.
 * date :  2017/2/23.
 */

public class VerifyPhoneDutyImpl extends Duty {
    @Override
    public boolean verifyImpl(User user) {
        String phone = user.phone;
        if (phone == null) return false;
        else if (phone.contains("186"))
            return true;
        return false;
    }
}
