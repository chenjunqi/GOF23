package com.bookbuf.gof23.state.impls;

import com.bookbuf.gof23.Music;
import com.bookbuf.gof23.state.ContextState;
import com.bookbuf.gof23.state.IMusicState;
import com.bookbuf.gof23.state.MusicState;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public class PlayStateImpl extends MusicState {
    public PlayStateImpl() {
        System.out.println("构建 PlayStateImpl");
    }

    @Override
    public IMusicState handle(ContextState contextState, Music music) {
        if (music.url == null) {
            return new SearchStateImpl();
        }
        if (!music.isDownload) {
            return new DownloadStateImpl();
        }
        return new PauseStateImpl();
    }

    @Override
    public boolean isDependOnUserAction() {
        return false;
    }
}
