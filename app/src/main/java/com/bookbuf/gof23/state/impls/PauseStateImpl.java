package com.bookbuf.gof23.state.impls;

import com.bookbuf.gof23.Music;
import com.bookbuf.gof23.state.ContextState;
import com.bookbuf.gof23.state.IMusicState;
import com.bookbuf.gof23.state.MusicState;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public class PauseStateImpl extends MusicState {

    public PauseStateImpl() {
        System.out.println("构建 PauseStateImpl");
    }

    @Override
    public IMusicState handle(ContextState contextState, Music music) {
        return new PlayStateImpl();
    }

    @Override
    public boolean isDependOnUserAction() {
        return true;
    }
}
