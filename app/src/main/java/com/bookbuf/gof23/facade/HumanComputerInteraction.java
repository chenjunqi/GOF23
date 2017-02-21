package com.bookbuf.gof23.facade;

import com.bookbuf.gof23.Machine;
import com.bookbuf.gof23.MusicDatabase;
import com.bookbuf.gof23.User;
import com.bookbuf.gof23.adapter.CommandAdapter;
import com.bookbuf.gof23.command.Invoker;
import com.bookbuf.gof23.command.impls.CookCommandImpl;
import com.bookbuf.gof23.command.impls.DanceCommandImpl;
import com.bookbuf.gof23.command.impls.SongCommandImpl;

/**
 * author: robert.
 * date :  2017/2/21.
 */
// 人机交互界面
public class HumanComputerInteraction {

    private Context context;

    public HumanComputerInteraction(HumanComputerInteraction.Context context) {
        this.context = context;
    }

    public void setUp() {
        // 初始化曲库
        final Machine machine = context.getMachine();
        final MusicDatabase database = machine.getDatabase();
        database.initDatabase();
        // 初始化命令
        final Invoker invoker = context.getInvoker();
        invoker.invoke(new CommandAdapter(CookCommandImpl.KEY_COOK, "红烧肉", context));
        invoker.invoke(new CommandAdapter(DanceCommandImpl.KEY_DANCE, "肚皮舞", context));
        invoker.invoke(new CommandAdapter(SongCommandImpl.KEY_SONG, "千里之外", context));
    }

    public static class Context {
        private Machine machine;
        private User user;
        private Invoker invoker = new Invoker();

        public Context(Machine machine, User user) {
            this.machine = machine;
            this.user = user;
        }

        public Machine getMachine() {
            return machine;
        }

        public void setMachine(Machine machine) {
            this.machine = machine;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Invoker getInvoker() {
            return invoker;
        }

        public void setInvoker(Invoker invoker) {
            this.invoker = invoker;
        }
    }
}
