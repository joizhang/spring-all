package com.joizhang.springpuzzle.xmlconfig;

import com.joizhang.springpuzzle.base.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Dependency injection xml config demo
 *
 * @author joizhang
 */
public class Bootstrap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("di-config.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student);
    }

}
