package com.joizhang.thinkinginspring.iocoverview.domain;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class UserFactory implements FactoryBean<User> {

    private Long id;

    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public User getObject() {
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }

    @Override
    public Class<User> getObjectType() {
        return User.class;
    }
}
