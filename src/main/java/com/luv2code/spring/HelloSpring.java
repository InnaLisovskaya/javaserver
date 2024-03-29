package com.luv2code.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
  public static void main(String[] args) {

    //load the spring configuration file
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    //retrieve bean from the spring container
    Coach theCoach = context.getBean("myCoach", Coach.class );

    //call methods on the bean
    System.out.println(theCoach.getDailyWorkout());

    //close the context
    context.close();
  }
}
