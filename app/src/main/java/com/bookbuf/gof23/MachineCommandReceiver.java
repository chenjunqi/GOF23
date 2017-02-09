package com.bookbuf.gof23;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public interface MachineCommandReceiver {

    void onReceive(String method, String param);
}
