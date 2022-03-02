package com.coolzhul.common.model.user;

import com.coolzhul.common.util.TgSet;
import com.coolzhul.common.util.TgSets;

public class User {
    @TgSets({
            @TgSet(begin = 1, end = 1,sort = 1),
            @TgSet(begin = 1, end = 1,sort = 1)
    })
    private String userId;
    private String userName;
    private int age;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
