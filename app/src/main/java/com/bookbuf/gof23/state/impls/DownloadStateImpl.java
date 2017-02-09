package com.bookbuf.gof23.state.impls;

import com.bookbuf.gof23.Music;
import com.bookbuf.gof23.state.ContextState;
import com.bookbuf.gof23.state.IMusicState;
import com.bookbuf.gof23.state.MusicState;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public class DownloadStateImpl extends MusicState {

    public DownloadStateImpl() {
        System.out.println("构建 DownloadStateImpl");
    }

    @Override
    public IMusicState handle(ContextState contextState, Music music) {
        if (music.isDownload) {
            return new PlayStateImpl();
        }
        return new DownloadErrorStateImpl();
    }

    @Override
    public boolean isDependOnUserAction() {
        return false;
    }
}
