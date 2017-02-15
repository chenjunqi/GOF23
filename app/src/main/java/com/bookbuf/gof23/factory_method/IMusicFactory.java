package com.bookbuf.gof23.factory_method;

import com.bookbuf.gof23.Music;

import java.util.List;

/**
 * author: robert.
 * date :  2017/2/15.
 */

public interface IMusicFactory {

    List<Music> createDefaultMusicDatabase();
}
