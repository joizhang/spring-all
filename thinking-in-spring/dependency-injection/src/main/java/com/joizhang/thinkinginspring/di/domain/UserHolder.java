package com.joizhang.thinkinginspring.di.domain;

import com.joizhang.thinkinginspring.iocoverview.domain.User;

import java.util.StringJoiner;

public class UserHolder {

    private User user;

    public UserHolder() {
    }

    public UserHolder(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserHolder.class.getSimpleName() + "{", "}")
                .add("user=" + user)
                .toString();
    }
}
