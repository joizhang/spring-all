package com.joizhang.springpuzzle.javaconfig;

import com.joizhang.springpuzzle.base.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author joizhang
 */
@Configuration
@Import(StudentConfig.class)
public class SimpleBeanConfig {

    private final StudentConfig studentConfig;

    @Autowired
    public SimpleBeanConfig(StudentConfig studentConfig) {
        this.studentConfig = studentConfig;
    }

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBean(studentConfig.student());
    }
}
