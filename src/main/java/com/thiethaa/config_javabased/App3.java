package com.thiethaa.config_javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

//       Color color = context.getBean(White.class);
//       color.paint();

        Drawing drawing = context.getBean(Drawing.class);
        drawing.draw();
    }
}
