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

    public static ICommand createCommand(User user, Machine machine, String method, String param) {
        Command command;
        if (method.startsWith(DanceCommandImpl.KEY_DANCE)) {
            command = new DanceCommandImpl(param);
        } else if (method.startsWith(SongCommandImpl.KEY_SONG)) {
            command = new SongCommandImpl(param);
        } else if (method.startsWith(BoilWaterCommandImpl.KEY_BOIL_WATER)) {
            command = new BoilWaterCommandImpl(param);
        } else if (method.startsWith(CookCommandImpl.KEY_COOK)) {
            command = new CookCommandImpl(param);
        } else if (method.startsWith(OpenDoorCommandImpl.KEY_OPEN_DOOR)) {
            command = new OpenDoorCommandImpl(param, user, machine);
        } else {
            throw new IllegalArgumentException("NO COMMAND CREATED!!!");
        }
        return command;
    }
}
