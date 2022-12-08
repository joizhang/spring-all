package com.joizhang.springpuzzle.javaconfig;

import com.joizhang.springpuzzle.base.Student;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.context.annotation.Scope;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author joizhang
 */
@Configuration
public class StudentConfig implements ImportAware {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Student student() {
        Student student = new Student(0);
        student.setAge(22);
        student.setName("joizhang");
        return student;
    }


    @Override
    public void setImportMetadata(AnnotationMetadata importMetadata) {
        System.out.println("Import aware." + importMetadata.toString());
    }

}
