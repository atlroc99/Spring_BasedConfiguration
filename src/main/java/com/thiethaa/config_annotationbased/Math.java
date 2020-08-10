package com.thiethaa.config_annotationbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Math implements Course{
    @Value("101")
    private int id;
    @Value("Mr.Math")
    private String teacher;

    public void takeCourse(){
        System.out.println("Math Course...");
    }

    @Override
    public String toString() {
        return "Math{" +
                "id=" + id +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
