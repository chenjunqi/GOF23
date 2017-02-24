package com.bookbuf.gof23;

/**
 * author: robert.
 * date :  2017/2/10.
 */

public class User {

    /*头像、姓名、邮箱地址、电话、密码*/

    public String name;
    public String avatar;
    public String email;
    public String phone;
    public String password;

    public User(String name) {
        this.name = name;
    }

    public User(String name, String avatar, String email, String phone, String password) {
        this.name = name;
        this.avatar = avatar;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
