package com.bookbuf.gof23.prototype;

/**
 * author: robert.
 * date :  2017/2/17.
 */

public interface PrototypeObject {

    default Object __proto__() {
        return new Object();
    }

}
