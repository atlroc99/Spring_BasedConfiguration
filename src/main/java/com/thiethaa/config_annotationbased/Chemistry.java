package com.thiethaa.config_annotationbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chemistry implements Course {
    @Value("202")
    private int id;
    @Value("Mrs.Chemistry")
    private String teacher;

    public void takeCourse(){
        System.out.println("Chemistry Course...");
    }

    @Override
    public String toString() {
        return "Chemistry{" +
                "id=" + id +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
