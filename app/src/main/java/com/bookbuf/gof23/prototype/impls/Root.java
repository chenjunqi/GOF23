package com.bookbuf.gof23.prototype.impls;

import com.bookbuf.gof23.prototype.ProtoObject;

/**
 * author: robert.
 * date :  2017/2/17.
 */

public class Root extends ProtoObject {
    public Root(ProtoObject cloneProto) {
        super(cloneProto);
    }

    public void root() {
        System.out.println("Root");
    }

}
