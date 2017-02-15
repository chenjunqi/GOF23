package com.bookbuf.gof23.factory_method.impls;

import com.bookbuf.gof23.Music;
import com.bookbuf.gof23.factory_method.AbsMethodFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * author: robert.
 * date :  2017/2/15.
 */

public class PopularMusicFactory extends AbsMethodFactory {

    @Override
    protected List<Music> createDatabase() {
        List<Music> musics = new ArrayList<>();
        musics.add(new Music("稻香"));
        musics.add(new Music("千里之外"));
        musics.add(new Music("十年"));
        musics.add(new Music("白玫瑰"));
        musics.add(new Music("K歌之王"));
        return musics;
    }

}
