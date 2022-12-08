package com.joizhang.thinkinginspring.iocoverview;

import com.joizhang.thinkinginspring.iocoverview.annotation.Super;
import com.joizhang.thinkinginspring.iocoverview.domain.SuperUser;
import com.joizhang.thinkinginspring.iocoverview.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 依赖查找示例
 */
public class DependencyLookupDemo {

    public static void main(String[] args) {
        // 启动 Spring 应用上下文
        ListableBeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-lookup-context.xml");
        // 按照类型查找
        lookupByType(beanFactory);
        // 按照类型查找结合对象
        lookupCollectionByType(beanFactory);
        // 通过注解查找对象
        lookupByAnnotationType(beanFactory);
    }

    private static void lookupByType(BeanFactory beanFactory) {
        User user = beanFactory.getBean("user", User.class);
        System.out.println("实时查找：" + user);
        user = beanFactory.getBean("superUser", SuperUser.class);
        System.out.println("实时查找：" + user);
    }

    private static void lookupCollectionByType(ListableBeanFactory beanFactory) {
        Map<String, User> users = beanFactory.getBeansOfType(User.class);
        System.out.println("查找到的所有的 User 集合对象：" + users);
    }

    private static void lookupByAnnotationType(ListableBeanFactory beanFactory) {
        Map<String, Object> users = beanFactory.getBeansWithAnnotation(Super.class);
        System.out.println("查找标注 @Super 所有的 User 集合对象：" + users);
    }

}
