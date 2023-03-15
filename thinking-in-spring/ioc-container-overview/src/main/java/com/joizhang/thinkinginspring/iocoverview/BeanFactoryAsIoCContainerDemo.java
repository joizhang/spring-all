package com.joizhang.thinkinginspring.iocoverview;

import com.joizhang.thinkinginspring.iocoverview.domain.User;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import java.util.Map;

public class BeanFactoryAsIoCContainerDemo {

    public static void main(String[] args) {
        // 创建 BeanFactory 容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        // XML 配置文件 ClassPath 路径
        String location = "classpath:/META-INF/dependency-lookup-context.xml";
        // 加载配置
        int beanDefinitionsCount = reader.loadBeanDefinitions(location);
        System.out.println("Bean 定义加载的数量：" + beanDefinitionsCount);
        lookupCollectionByType(beanFactory);
    }

    private static void lookupCollectionByType(ListableBeanFactory beanFactory) {
        Map<String, User> userMap = beanFactory.getBeansOfType(User.class);
        userMap.forEach((s, user) -> System.out.println("查找到的所有的 User 集合对象：" + user));
    }

}
