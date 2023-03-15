package com.joizhang.thinkinginspring.iocoverview;

import com.joizhang.thinkinginspring.iocoverview.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.Map;

public class AnnotationApplicationContextAsIoCContainerDemo {

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        // 将当前类 AnnotationApplicationContextAsIoCContainerDemo 作为配置类（Configuration Class）
        applicationContext.register(AnnotationApplicationContextAsIoCContainerDemo.class);
        // 启动应用上下文
        applicationContext.refresh();
        // 依赖查找集合对象
        lookupCollectionByType(applicationContext);
        // 关闭应用上下文
        applicationContext.close();
    }

    @Bean
    public User user1() {
        User user = new User();
        user.setId(1L);
        user.setName("小马哥");
        return user;
    }

    @Bean
    public User user2() {
        User user = new User();
        user.setId(2L);
        user.setName("joizhang");
        return user;
    }

    private static void lookupCollectionByType(AbstractApplicationContext applicationContext) {
        Map<String, User> userMap = applicationContext.getBeansOfType(User.class);
        userMap.forEach((s, user) -> System.out.println("查找到的所有的 User 集合对象：" + user));
    }

}
