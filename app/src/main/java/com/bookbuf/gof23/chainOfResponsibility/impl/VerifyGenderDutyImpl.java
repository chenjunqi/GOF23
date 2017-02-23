package com.bookbuf.gof23.chainOfResponsibility.impl;

import com.bookbuf.gof23.User;
import com.bookbuf.gof23.chainOfResponsibility.Duty;

/**
 * author: robert.
 * date :  2017/2/23.
 */

public class VerifyGenderDutyImpl extends Duty {
    @Override
    public boolean verifyImpl(User user) {
        boolean bool = user.isMale;
        System.out.println("[VerifyGenderDutyImpl] 验证结果：" + bool);
        return bool;
    }
}
