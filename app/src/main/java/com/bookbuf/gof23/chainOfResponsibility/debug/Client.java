package com.bookbuf.gof23.chainOfResponsibility.debug;

import com.bookbuf.gof23.User;
import com.bookbuf.gof23.chainOfResponsibility.Duty;
import com.bookbuf.gof23.chainOfResponsibility.impl.VerifyEmptyDutyImpl;
import com.bookbuf.gof23.chainOfResponsibility.impl.VerifyGenderDutyImpl;
import com.bookbuf.gof23.chainOfResponsibility.impl.VerifyLoginStateDutyImpl;

/**
 * author: robert.
 * date :  2017/2/23.
 */

public class Client {

    public static void main(String[] atgs) {

        User user = new User("Alice");
        user.isLogin = true;
        user.isMale = true;

        Duty emptyDuty = new VerifyEmptyDutyImpl();
        Duty genderDuty = new VerifyGenderDutyImpl();
        Duty loginStateDuty = new VerifyLoginStateDutyImpl();


        emptyDuty.setNext(genderDuty).setNext(loginStateDuty).moveToFirst().verify(user);

    }
}
