package com.joizhang.thinkinginspring.iocoverview;

import com.joizhang.thinkinginspring.iocoverview.domain.User;
import com.joizhang.thinkinginspring.iocoverview.domain.UserFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Map;

public class FactoryBeanDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(FactoryBeanDemo.class);
        applicationContext.refresh();
        lookupCollectionByType(applicationContext);
        applicationContext.close();
    }

    @Bean
    public UserFactory userFactory() {
        UserFactory userFactory = new UserFactory();
        userFactory.setId(1L);
        userFactory.setName("joizhang");
        return userFactory;
    }

    @Bean
    public User user() {
        return userFactory().getObject();
    }

    private static void lookupCollectionByType(AbstractApplicationContext applicationContext) {
        Map<String, User> userMap = applicationContext.getBeansOfType(User.class);
        System.out.println("查找到的所有的 User 集合对象：" + userMap);
    }

}
