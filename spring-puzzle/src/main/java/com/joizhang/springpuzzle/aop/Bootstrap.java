package com.joizhang.springpuzzle.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author joizhang
 */
public class Bootstrap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml");
        SimpleAopBean bean = context.getBean(SimpleAopBean.class);
        bean.testB();
        System.out.println(bean.getClass().getSimpleName());
    }

}
