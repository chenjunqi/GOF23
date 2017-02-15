package com.bookbuf.gof23;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public class Music {

    public static final String KEY_SEARCH_ERROR = "模拟错误歌曲";

    public String name;
    public String url;
    public boolean isDownload;
    public boolean isError;

    public Music() {
    }

    public Music(String name) {
        this.name = name;
    }
}
