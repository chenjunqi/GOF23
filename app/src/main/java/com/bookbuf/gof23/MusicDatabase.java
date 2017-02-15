package com.bookbuf.gof23;

import com.bookbuf.gof23.factory_method.AbsMethodFactory;
import com.bookbuf.gof23.factory_method.impls.BluesMusicFactory;
import com.bookbuf.gof23.factory_method.impls.JazzMusicFactory;
import com.bookbuf.gof23.factory_method.impls.PopularMusicFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * author: robert.
 * date :  2017/2/15.
 */

public class MusicDatabase {

    private static MusicDatabase database = new MusicDatabase();
    private List<Music> musics = new ArrayList<>();

    private MusicDatabase() {
    }

    public static MusicDatabase getDatabase() {
        return database;
    }

    private List<AbsMethodFactory> initFactory() {
        List<AbsMethodFactory> list = new ArrayList<>();
        list.add(new JazzMusicFactory());
        list.add(new BluesMusicFactory());
        list.add(new PopularMusicFactory());
        return list;
    }

    public void initDatabase() {

        List<AbsMethodFactory> factories = initFactory();
        for (AbsMethodFactory factory : factories) {
            List<Music> musics = factory.createDefaultMusicDatabase();
            System.out.printf("添加歌曲库:%s:%d首%n", factory.getClass().getSimpleName(), musics.size());
            this.musics.addAll(musics);
        }

    }
}
