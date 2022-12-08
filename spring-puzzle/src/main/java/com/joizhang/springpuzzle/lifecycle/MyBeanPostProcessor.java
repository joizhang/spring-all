package com.joizhang.springpuzzle.lifecycle;

import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author joizhang
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    public MyBeanPostProcessor() {
        super();
        System.out.println("这是BeanPostProcessor实现类构造器！！");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！");
        return bean;
    }
}