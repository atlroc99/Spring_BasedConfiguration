package com.thiethaa;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.thiethaa.config_xmlbased.Iphone;
import com.thiethaa.config_xmlbased.MobilePhone;
import com.thiethaa.config_xmlbased.Samsung;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */


    @Test
    public void testObjPrototype(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        MobilePhone m1 = (Iphone)context.getBean("iphone");
        MobilePhone m2 = (Iphone)context.getBean("iphone");
        assertNotSame(m1,m2);
    }

    @Test
    public void testObjSingleton(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        MobilePhone m1 = (Samsung)context.getBean("samsung");
        MobilePhone m2 = (Samsung)context.getBean("samsung");
        assertSame(m1,m2);
    }
}
