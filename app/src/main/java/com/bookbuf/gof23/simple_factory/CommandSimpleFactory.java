package com.bookbuf.gof23.simple_factory;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.User;
import com.bookbuf.gof23.command.ICommand;
import com.bookbuf.gof23.command.impls.BoilWaterCommandImpl;
import com.bookbuf.gof23.command.impls.Command;
import com.bookbuf.gof23.command.impls.CookCommandImpl;
import com.bookbuf.gof23.command.impls.DanceCommandImpl;
import com.bookbuf.gof23.command.impls.OpenDoorCommandImpl;
import com.bookbuf.gof23.command.impls.SongCommandImpl;

/**
 * author: robert.
 * date :  2017/2/14.
 */

public class CommandSimpleFactory {

    private static boolean equals(String method, String key) {
        return method.startsWith(key);
    }

    public static ICommand createCommand(User user, Machine machine, String method, String param) {
        Command command;
        if (equals(method, DanceCommandImpl.KEY_DANCE)) {
            command = new DanceCommandImpl(param);
        } else if (equals(method, SongCommandImpl.KEY_SONG)) {
            command = new SongCommandImpl(param);
        } else if (equals(method, BoilWaterCommandImpl.KEY_BOIL_WATER)) {
            command = new BoilWaterCommandImpl(param);
        } else if (equals(method, CookCommandImpl.KEY_COOK)) {
            command = new CookCommandImpl(param);
        } else if (equals(method, OpenDoorCommandImpl.KEY_OPEN_DOOR)) {
            command = new OpenDoorCommandImpl(param, user, machine);
        } else {
            throw new IllegalArgumentException("NO COMMAND CREATED!!!");
        }
        return command;
    }
}
