package com.joizhang.springpuzzle.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author joizhang
 */
public class Bootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }

}
