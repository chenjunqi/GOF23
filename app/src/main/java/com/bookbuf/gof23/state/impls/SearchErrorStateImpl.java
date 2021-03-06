package com.bookbuf.gof23.state.impls;

import com.bookbuf.gof23.Music;
import com.bookbuf.gof23.state.ContextState;
import com.bookbuf.gof23.state.IMusicState;
import com.bookbuf.gof23.state.MusicState;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public class SearchErrorStateImpl extends MusicState {

    public SearchErrorStateImpl() {
        System.out.println("构建 SearchErrorStateImpl");
    }

    @Override
    public IMusicState handle(ContextState contextState, Music music) {
        music.isError = true;
        return new PendingStateImpl();
    }

    @Override
    public boolean isDependOnUserAction() {
        return false;
    }
}
