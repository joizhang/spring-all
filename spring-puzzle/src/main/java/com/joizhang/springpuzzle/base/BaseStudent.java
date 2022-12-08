package com.joizhang.springpuzzle.base;

import java.util.StringJoiner;

/**
 * @author joizhang
 */
public abstract class BaseStudent {

    private Integer id;

    BaseStudent(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BaseStudent.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .toString();
    }
}
