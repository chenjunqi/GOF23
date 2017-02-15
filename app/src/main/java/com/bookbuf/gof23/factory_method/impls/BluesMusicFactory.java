package com.bookbuf.gof23.factory_method.impls;

import com.bookbuf.gof23.Music;
import com.bookbuf.gof23.factory_method.AbsMethodFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * author: robert.
 * date :  2017/2/15.
 */

public class BluesMusicFactory extends AbsMethodFactory {
    @Override
    protected List<Music> createDatabase() {
        List<Music> musics = new ArrayList<>();
        musics.add(new Music("Freeki "));
        musics.add(new Music("Det.riot "));
        musics.add(new Music("Hello 2morrow"));
        musics.add(new Music("Ochii care "));
        musics.add(new Music("Chill "));
        return musics;
    }
}
