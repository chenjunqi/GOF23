package com.bookbuf.gof23.builder;

/**
 * author: robert.
 * date :  2017/2/24.
 */

public class Client {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .buildColor("蓝色")
                .buildGender("男")
                .buildHeight("186cm")
                .buildWeight("66kg")
                .build();
        System.out.println(person.toString());
    }
}
