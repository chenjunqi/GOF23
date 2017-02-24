package com.bookbuf.gof23.chainOfResponsibility.impl;

import com.bookbuf.gof23.User;
import com.bookbuf.gof23.chainOfResponsibility.Duty;

/**
 * author: robert.
 * date :  2017/2/23.
 */

public class VerifyAvatarDutyImpl extends Duty {
    @Override
    public boolean verifyImpl(User user) {
        String avatar = user.avatar;
        if (avatar == null) return false;
        else if (avatar.contains("http://"))
            return true;
        return false;
    }
}
