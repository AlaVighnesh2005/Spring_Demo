package com.vvit.coredemo;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");  //Inversion of control(IoC)
//    	Test test = context.getBean(Test.class);  // eliminated new Test();
//    	test.test_method();
    	
//    	ApplicationContext context = new ClassPathXmlApplicationContext("");
    	Car car = context.getBean(Car.class);
    	car.driving();
    	
    	Bus bus = context.getBean(Bus.class);
    	bus.driving();
    }
}
