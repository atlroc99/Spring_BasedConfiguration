package com.thiethaa.config_javabased;

import org.springframework.stereotype.Component;

@Component
public class White implements  Color{
    private int colorId;

    public void paint(){
        System.out.println("painting using color white...");
    }

    @Override
    public String toString() {
        return "White{" +
                "colorId=" + colorId +
                '}';
    }
}
