package com.bookbuf.gof23.adapter;

import com.bookbuf.gof23.command.ICommand;
import com.bookbuf.gof23.command.impls.Command;
import com.bookbuf.gof23.command.impls.DanceCommandImpl;
import com.bookbuf.gof23.command.impls.SongCommandImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/**
 * author: robert.
 * date :  2017/2/9.
 */

public class CommandAdapter implements ICommand {

    private String method;
    private String param;
    private HashMap<String, Command> map = new HashMap<>();

    private Command pickCommand(String method, String param) {
        Command command = null;
        if (method.startsWith(DanceCommandImpl.KEY_DANCE)) {
            command = createCommand(DanceCommandImpl.KEY_DANCE, param, DanceCommandImpl.class);
        } else if (method.startsWith(SongCommandImpl.KEY_SONG)) {
            command = createCommand(SongCommandImpl.KEY_SONG, param, SongCommandImpl.class);
        }
        return command;
    }

    private Command createCommand(String key, String param, Class<?> clazz) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        Command command = null;
        try {
            Constructor<?> constructor = clazz.getConstructor(String.class);
            command = (Command) constructor.newInstance(param);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        if (command != null) {
            map.put(key, command);
            return command;
        } else {
            throw new IllegalArgumentException("NO COMMAND CREATED!!!");
        }
    }

    public CommandAdapter(String method, String param) {
        this.method = method;
        this.param = param;
    }

    @Override
    public void excute() {
        System.out.println("调用指令：" + toString());
        Command command = pickCommand(this.method, this.param);
        command.excute();
    }

    @Override
    public String toString() {
        return "CommandAdapter{" +
                "method='" + method + '\'' +
                ", param='" + param + '\'' +
                ", map=" + map +
                '}';
    }
}
