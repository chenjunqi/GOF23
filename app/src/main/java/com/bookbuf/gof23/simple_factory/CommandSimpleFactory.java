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

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * author: robert.
 * date :  2017/2/14.
 */

public class CommandSimpleFactory {

    public static ICommand createCommand(User user, Machine machine, String method, String param) {
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
    private static Command createCommand(String key, String param, Class<?> clazz) {
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
            return command;
        } else {
            throw new IllegalArgumentException("NO COMMAND CREATED!!!");
        }
    }
}
