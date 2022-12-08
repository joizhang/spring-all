package com.joizhang.thinkinginspring.iocoverview.domain;

import com.joizhang.thinkinginspring.iocoverview.annotation.Super;

import java.util.StringJoiner;

/**
 * @author mercyblitz
 */
@Super
public class SuperUser extends User {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SuperUser.class.getSimpleName() + "{", "}")
                .add(super.toString())
                .add("address='" + address + "'")
                .toString();
    }
}
