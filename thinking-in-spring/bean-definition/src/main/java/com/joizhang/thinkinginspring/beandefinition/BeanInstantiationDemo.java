package com.joizhang.thinkinginspring.beandefinition;

import com.joizhang.thinkinginspring.iocoverview.domain.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean 实例化示例
 */
public class BeanInstantiationDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:META-INF/bean-instantiation-context.xml");
        User userByStaticMethod = applicationContext.getBean("user-by-static-method", User.class);
        User userByInstanceMethod = applicationContext.getBean("user-by-instance-method", User.class);
        User userByFactoryBean = applicationContext.getBean("user-by-factory-bean", User.class);

        System.out.println(userByStaticMethod == userByInstanceMethod);
        System.out.println(userByInstanceMethod == userByFactoryBean);
    }

}
