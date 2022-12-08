package com.joizhang.thinkinginspring.iocoverview;

import com.joizhang.thinkinginspring.iocoverview.repository.UserRepository;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

/**
 * 依赖注入示例
 */
public class DependencyInjectionDemo {

    public static void main(String[] args) {
        // 启动 Spring 应用上下文
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-injection-context.xml");
        // 依赖来源一：自定义 Bean
        UserRepository userRepository = applicationContext.getBean("userRepository", UserRepository.class);
        // 依赖来源二：依赖注入（內建依赖）
        System.out.println(userRepository.getBeanFactory());
        ObjectFactory<ApplicationContext> userFactory = userRepository.getObjectFactory();
        System.out.println(userFactory.getObject() == applicationContext);
        // 依赖来源三：容器內建 Bean
        Environment environment = applicationContext.getBean(Environment.class);
        System.out.println("获取 Environment 类型的 Bean：" + environment);
    }

}
