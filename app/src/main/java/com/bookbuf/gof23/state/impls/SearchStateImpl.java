package com.bookbuf.gof23.state.impls;

import com.bookbuf.gof23.Music;
import com.bookbuf.gof23.state.ContextState;
import com.bookbuf.gof23.state.IMusicState;
import com.bookbuf.gof23.state.MusicState;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public class SearchStateImpl extends MusicState {

    public SearchStateImpl() {
        System.out.println("构建 SearchStateImpl");
    }

    @Override
    public IMusicState handle(ContextState contextState, Music music) {

        if (music.name.equalsIgnoreCase(Music.KEY_SEARCH_ERROR)) {
            return new SearchErrorStateImpl();
        }
        if (music.url == null) {
            music.url = "搜到到歌曲为:<稻香>";
            return new DownloadStateImpl();
        }

        if (!music.isDownload) {
            return new DownloadStateImpl();
        }

        return new PlayStateImpl();
    }

    @Override
    public boolean isDependOnUserAction() {
        return false;
    }
}
