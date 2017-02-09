package com.bookbuf.gof23.state.debug;

import com.bookbuf.gof23.Music;
import com.bookbuf.gof23.state.ContextState;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public class Client {

    public static void main(String[] args) {


        /*searchError();*/

        playNormal();

    }

    private static void playNormal() {
        Music music = new Music();
        music.name = "《求佛》";
        music.url = "www.baidu.com";
        music.isDownload = true;
        ContextState manager = new ContextState();
        manager.loop(music);
    }

    private static void searchError() {
        Music music = new Music();
        music.name = Music.KEY_SEARCH_ERROR;

        ContextState manager = new ContextState();
        manager.loop(music);
    }
}
