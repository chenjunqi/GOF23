package com.bookbuf.gof23.factory_method.impls;

import com.bookbuf.gof23.Music;
import com.bookbuf.gof23.factory_method.AbsMethodFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * author: robert.
 * date :  2017/2/15.
 */

public class JazzMusicFactory extends AbsMethodFactory {

    @Override
    protected List<Music> createDatabase() {
        List<Music> musics = new ArrayList<>();
        musics.add(new Music("all the way"));
        musics.add(new Music("last waltz"));
        musics.add(new Music("can't take my eyes off you"));
        musics.add(new Music("over the rainbow"));
        musics.add(new Music("moon river"));
        musics.add(new Music("when i fall in love"));
        musics.add(new Music("smoke gets in your eyes "));
        musics.add(new Music("fly my to the moon"));
        musics.add(new Music("The look of love"));
        musics.add(new Music("Tennessee waltz"));
        return musics;
    }
}
