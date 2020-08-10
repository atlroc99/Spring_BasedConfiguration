package com.thiethaa.config_javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Drawing {
    @Autowired
    @Qualifier("white")
    private Color color;

    void draw(){
        color.paint();
    }
}
