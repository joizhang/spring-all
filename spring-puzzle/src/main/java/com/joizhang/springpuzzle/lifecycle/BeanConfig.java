package com.joizhang.springpuzzle.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author joizhang
 */
@Configuration
public class BeanConfig {

    @Bean(initMethod = "myInit", destroyMethod = "myDestory")
    public Person person() {
        Person person = new Person();
        person.setName("joizhang");
        person.setAddress("China");
        person.setPhone("11111111111");
        return person;
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }

    @Bean
    public MyInstantiationAwareBeanPostProcessor myInstantiationAwareBeanPostProcessor() {
        return new MyInstantiationAwareBeanPostProcessor();
    }

}
