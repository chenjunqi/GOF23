package com.bookbuf.gof23.chainOfResponsibility.impl;

import com.bookbuf.gof23.User;
import com.bookbuf.gof23.chainOfResponsibility.Duty;

/**
 * author: robert.
 * date :  2017/2/23.
 */

public class VerifyEmptyDutyImpl extends Duty {

    @Override
    protected boolean verifyImpl(User user) {
        boolean bool = user != null || user.name == null;
        System.out.println("[VerifyEmptyDutyImpl] 验证结果：" + bool);
        return bool;
    }
}
