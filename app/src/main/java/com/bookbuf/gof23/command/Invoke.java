package com.bookbuf.gof23.command;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.command.impls.DanceCommandImpl;
import com.bookbuf.gof23.command.impls.SongCommandImpl;

import java.util.HashMap;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class Invoke {

    private HashMap<String, ICommand> map = new HashMap<>();

    private ICommand pickCommand(String method) {
        ICommand command = null;
        if (method.startsWith(DanceCommandImpl.KEY_DANCE)) {
            command = createCommand(DanceCommandImpl.KEY_DANCE, DanceCommandImpl.class);
        } else if (method.startsWith(SongCommandImpl.KEY_SONG)) {
            command = createCommand(SongCommandImpl.KEY_SONG, SongCommandImpl.class);
        }
        return command;
    }

    private ICommand createCommand(String key, Class<?> clazz) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        ICommand command = null;
        try {
            command = (ICommand) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if (command != null) {
            map.put(key, command);
            return command;
        } else {
            throw new IllegalArgumentException("NO COMMAND CREATED!!!");
        }
    }

    public void invoke(Machine machine, String method, String param) {

        ICommand command = pickCommand(method);
        command.excute(machine, param);

    }

}
