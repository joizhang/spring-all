package com.joizhang.springpuzzle.aop;

/**
 * @author joizhang
 */
public class SimpleChildAopBean extends SimpleAopBean {

    @Override
    public void testC() {
        System.out.println("child testC");
    }

}