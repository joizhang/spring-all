package com.joizhang.springpuzzle.javaconfig;

import com.joizhang.springpuzzle.base.SimpleBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Dependency injection java config demo
 *
 * @author joizhang
 */
public class Bootstrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SimpleBeanConfig.class);
        SimpleBean simpleBean = context.getBean(SimpleBean.class);
        System.out.println(simpleBean.getStudent().getName());
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }

}
