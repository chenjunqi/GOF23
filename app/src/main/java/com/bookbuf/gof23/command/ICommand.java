package com.bookbuf.gof23.command;

import com.bookbuf.gof23.Machine;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public interface ICommand {

    void excute(Machine machine, String param);
}
