package com.bookbuf.gof23.factory_method;

import com.bookbuf.gof23.Music;

import java.util.List;

/**
 * author: robert.
 * date :  2017/2/15.
 */

public abstract class AbsMethodFactory {

    public final List<Music> createDefaultMusicDatabase() {
        List<Music> musics = createDatabase();
        print(musics);
        return musics;
    }

    private void print(List<Music> musics) {
        for (Music music : musics) {
            System.out.printf("%s :创建了歌曲:%s%n", getClass().getSimpleName(), music.name);
        }
    }

    protected abstract List<Music> createDatabase();
}
