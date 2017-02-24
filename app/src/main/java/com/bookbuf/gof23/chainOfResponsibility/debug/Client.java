package com.bookbuf.gof23.chainOfResponsibility.debug;

import com.bookbuf.gof23.User;
import com.bookbuf.gof23.chainOfResponsibility.impl.VerifyAvatarDutyImpl;
import com.bookbuf.gof23.chainOfResponsibility.impl.VerifyEmailDutyImpl;
import com.bookbuf.gof23.chainOfResponsibility.impl.VerifyPasswordDutyImpl;
import com.bookbuf.gof23.chainOfResponsibility.impl.VerifyPhoneDutyImpl;
import com.bookbuf.gof23.chainOfResponsibility.impl.VerifyRealNameDutyImpl;

/**
 * author: robert.
 * date :  2017/2/23.
 */

public class Client {

    public static void main(String[] atgs) {

        User user = new User("幺鹿幺鹿幺鹿", "http://www.jianshu.com", "chenjunqi.china@gmail.com", "18668247775", "1234567");

        new VerifyAvatarDutyImpl()
                .setNext(new VerifyRealNameDutyImpl())
                .setNext(new VerifyEmailDutyImpl())
                .setNext(new VerifyPhoneDutyImpl())
                .setNext(new VerifyPasswordDutyImpl())
                .moveToFirst()
                .verify(user);

    }
}
