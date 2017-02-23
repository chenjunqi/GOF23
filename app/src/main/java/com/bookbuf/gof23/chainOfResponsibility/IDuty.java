package com.bookbuf.gof23.chainOfResponsibility;

/**
 * author: robert.
 * date :  2017/2/23.
 */

public interface IDuty<User> {
    boolean verify(User user);
}
