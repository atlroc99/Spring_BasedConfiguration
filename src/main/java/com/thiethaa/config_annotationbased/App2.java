package com.thiethaa.config_annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Course course =(Chemistry)context.getBean("chemistry");
        System.out.println(course);
        course.takeCourse();
    }
}
