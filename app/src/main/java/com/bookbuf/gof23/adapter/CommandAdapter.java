package com.bookbuf.gof23.adapter;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.User;
import com.bookbuf.gof23.command.ICommand;
import com.bookbuf.gof23.command.impls.BoilWaterCommandImpl;
import com.bookbuf.gof23.command.impls.Command;
import com.bookbuf.gof23.command.impls.CookCommandImpl;
import com.bookbuf.gof23.command.impls.DanceCommandImpl;
import com.bookbuf.gof23.command.impls.OpenDoorCommandImpl;
import com.bookbuf.gof23.command.impls.SongCommandImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

// 适配类：用于适配ICommand接口
public class CommandAdapter implements ICommand {

    private String method;
    private String param;
    private User user;
    private Machine machine;

    public CommandAdapter(String method, String param, User user, Machine machine) {
        this.method = method;
        this.param = param;
        this.user = user;
        this.machine = machine;
    }

    private HashMap<String, Command> map = new HashMap<>();

    // 不同method适配为对应的操作指令
    private Command pickCommand(String method, String param) {
        Command command = null;
        if (method.startsWith(DanceCommandImpl.KEY_DANCE)) {
            command = createCommand(DanceCommandImpl.KEY_DANCE, param, DanceCommandImpl.class);
        } else if (method.startsWith(SongCommandImpl.KEY_SONG)) {
            command = createCommand(SongCommandImpl.KEY_SONG, param, SongCommandImpl.class);
        } else if (method.startsWith(BoilWaterCommandImpl.KEY_BOIL_WATER)) {
            command = createCommand(BoilWaterCommandImpl.KEY_BOIL_WATER, param, BoilWaterCommandImpl.class);
        } else if (method.startsWith(CookCommandImpl.KEY_COOK)) {
            command = createCommand(CookCommandImpl.KEY_COOK, param, CookCommandImpl.class);
        } else if (method.startsWith(OpenDoorCommandImpl.KEY_OPEN_DOOR)) {
            command = createCommand(OpenDoorCommandImpl.KEY_OPEN_DOOR, param, OpenDoorCommandImpl.class);
            OpenDoorCommandImpl openDoorCommand = (OpenDoorCommandImpl) command;
            openDoorCommand.setUser(user);
            openDoorCommand.setMachine(machine);
        }
        return command;
    }

    // 创建过程由内部控制
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
