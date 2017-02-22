package com.bookbuf.gof23.iterator.client;

import com.bookbuf.gof23.iterator.Array;
import com.bookbuf.gof23.iterator.Iterator;

/**
 * author: robert.
 * date :  2017/2/22.
 */

public class Client {

    public static void main(String[] args) {
        Array<String> array = new Array();
        array.add("清华大学");
        array.add("北京大学");
        array.add("浙江大学");
        array.add("武汉大学");
        array.add("西安交通大学");
        array.add("上海交通大学");
        array.add("人民大学");


        Iterator<String> iterator = array.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }
}
