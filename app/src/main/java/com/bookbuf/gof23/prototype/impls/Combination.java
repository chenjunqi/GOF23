package com.bookbuf.gof23.prototype.impls;

import com.bookbuf.gof23.prototype.ProtoObject;

/**
 * author: robert.
 * date :  2017/2/17.
 */

public class Combination extends ProtoObject {
    public Combination(ProtoObject cloneProto) {
        super(cloneProto);
    }

    public void combination() {
        System.out.println("Combination");
    }

}
