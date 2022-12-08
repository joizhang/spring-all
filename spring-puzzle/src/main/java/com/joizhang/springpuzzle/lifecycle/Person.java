package com.joizhang.springpuzzle.lifecycle;

import org.springframework.beans.factory.*;

/**
 * Bean的完整生命周期经历了各种方法调用，这些方法可以划分为以下几类：
 *
 * <p>1、Bean自身的方法：这个包括了Bean本身调用的方法和通过配置文件中
 * <bean>的init-method和destroy-method指定的方法</p>
 *
 * <p>2、Bean级生命周期接口方法：这个包括了BeanNameAware、BeanFactoryAware、
 * InitializingBean和DiposableBean这些接口的方法</p>
 *
 * <p>3、容器级生命周期接口方法：这个包括了InstantiationAwareBeanPostProcessor
 * 和 BeanPostProcessor 这两个接口实现，
 * 一般称它们的实现类为“后处理器”。</p>
 *
 * <p>4、工厂后处理器接口方法：这个包括了AspectJWeavingEnabler,
 * ConfigurationClassPostProcessor, CustomAutowireConfigurer 等等非
 * 常有用的工厂后处理器接口的方法。工厂后处理器也是容器级的。在应用上下文
 * 装配配置文件之后立即调用。</p>
 *
 * @author https://www.cnblogs.com/zrtqsk/p/3735273.html
 */
public class Person implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

    private String name;
    private String address;
    private String phone;

    private BeanFactory beanFactory;
    private String beanName;

    public Person() {
        System.out.println("【构造器】调用Person的构造器实例化");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", beanFactory=" + beanFactory +
                ", beanName='" + beanName + '\'' +
                '}';
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        System.out.println("【BeanFactoryAware接口】调用BeanFactoryAware.setBeanFactory()");
        this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("【BeanNameAware接口】调用BeanNameAware.setBeanName()");
        this.beanName = beanName;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("【InitializingBean接口】调用InitializingBean.afterPropertiesSet()");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("【DiposibleBean接口】调用DiposibleBean.destory()");
    }

    public void myInit() {
        System.out.println("【init-method】调用<bean>的init-method属性指定的初始化方法");
    }

    public void myDestory() {
        System.out.println("【destroy-method】调用<bean>的destroy-method属性指定的初始化方法");
    }

}
