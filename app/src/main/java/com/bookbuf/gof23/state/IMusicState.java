package com.bookbuf.gof23.state;

import com.bookbuf.gof23.Music;

/**
 * author: robert.
 * date :  2017/2/8.
 */

public interface IMusicState {

    // 执行音乐相关操作
    IMusicState handle(ContextState contextState, Music music);

    // 状态是内部驱动还是外部驱动
    boolean isDependOnUserAction();

}
