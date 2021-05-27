package com.datamaking.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("Welcome to Maven based Java project ...");

        /**
        Car car_obj = new Car();
        car_obj.drive();

        Bike obj = new Bike();
        obj.drive();

        Vehicle vehi_obj = new Bike();//new Car();
        vehi_obj.drive();
        */

        // BeanFactory
        // ApplicationContext

        String xmlFile = "spring.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlFile);

        //Vehicle vehi_obj = (Vehicle) context.getBean("bike");
        //vehi_obj.drive();
        /*Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);*/

        Car obj = (Car) context.getBean("car");
        obj.drive();
    }
}
