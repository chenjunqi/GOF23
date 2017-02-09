package com.bookbuf.gof23.state;

import com.bookbuf.gof23.Music;
import com.bookbuf.gof23.state.impls.PendingStateImpl;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public class ContextState {

    private IMusicState state;

    public IMusicState getState() {
        return state;
    }

    public void setState(IMusicState state) {
        this.state = state;
    }

    public synchronized void loop(Music music) {
        System.out.println("loop +");
        while (true) {

            if (this.state == null) {
                this.state = new PendingStateImpl();
            }
            this.state = this.state.handle(this, music);
            if (this.state.isDependOnUserAction()) {
                System.out.println("等待用户再次触发状态的改变.");
                break;
            }
        }

        System.out.println("loop -");
    }
}
