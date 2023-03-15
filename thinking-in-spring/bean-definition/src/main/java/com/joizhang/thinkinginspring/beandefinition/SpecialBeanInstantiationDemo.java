package com.joizhang.thinkinginspring.beandefinition;

import com.joizhang.thinkinginspring.beandefinition.factory.DefaultUserFactory;
import com.joizhang.thinkinginspring.beandefinition.factory.UserFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ServiceLoader;

public class SpecialBeanInstantiationDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:META-INF/special-bean-instantiation-context.xml");
        AutowireCapableBeanFactory beanFactory = applicationContext.getAutowireCapableBeanFactory();
        ServiceLoader<UserFactory> serviceLoader = beanFactory.getBean("userFactoryServiceLoader", ServiceLoader.class);
        displayServiceLoader(serviceLoader);

        // 创建 UserFactory 对象，通过 AutowireCapableBeanFactory
        UserFactory userFactory = beanFactory.createBean(DefaultUserFactory.class);
        System.out.println(userFactory.createUser());
        applicationContext.close();
    }

    public static void displayServiceLoader(ServiceLoader<UserFactory > serviceLoader) {
        for (UserFactory userFactory : serviceLoader) {
            System.out.println(userFactory.createUser());
        }
    }

}
