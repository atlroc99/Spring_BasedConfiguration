package com.thiethaa.config_xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("\nConstructor style");
        MobilePhone mobilePhone =(Samsung)context.getBean("samsung");
        //System.out.println(mobilePhone);
        mobilePhone.takePic();

        System.out.println("\nSetter-Method style");
        MobilePhone mobilePhone1 =(Iphone)context.getBean("iphone");
        //System.out.println(mobilePhone1);
        mobilePhone1.takePic();

        System.out.println("\nFactory-Method with argument style");
        MobilePhone mobilePhone2 = (Iphone)context.getBean("phone");
        mobilePhone2.takePic();
        System.out.println("\nFactory-Method without argument style");
        MobilePhone mobilePhone4 = (Samsung)context.getBean("hp");
        mobilePhone4.takePic();

        System.out.println("\nInstance-Factory-Method style");
        MobilePhone mobilePhone3 = (Samsung)context.getBean("phonefactory");
        mobilePhone3.takePic();

    }
}
