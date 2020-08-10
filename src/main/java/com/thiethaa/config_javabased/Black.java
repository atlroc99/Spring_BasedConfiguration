package com.thiethaa.config_javabased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Black implements Color{
    private int colorId;

    public void paint(){
        System.out.println("painting using color black...");
    }

    @Override
    public String toString() {
        return "Black{" +
                "colorId=" + colorId +
                '}';
    }
}
