package com.joizhang.thinkinginspring.beandefinition.factory;

import com.joizhang.thinkinginspring.iocoverview.domain.User;

public interface UserFactory {

    default User createUser() {
        return User.createUser();
    }

}
