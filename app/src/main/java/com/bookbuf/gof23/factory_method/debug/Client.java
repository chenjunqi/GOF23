package com.bookbuf.gof23.factory_method.debug;

import com.bookbuf.gof23.MusicDatabase;

/**
 * author: robert.
 * date :  2017/2/15.
 */

public class Client {

    public static void main(String args[]) {

        /*Machine machine = new Machine("Samu");*/
        MusicDatabase.getDatabase().initDatabase();

    }
}
