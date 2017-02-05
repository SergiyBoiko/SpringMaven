package com.ghub.boiko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Car car = applicationContext.getBean(Car.class);
        System.out.println("Build car: "+car);
    }
}
