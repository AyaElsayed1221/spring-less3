package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

/*
   1.     Car car1 = new Car();annot find class [org/example/Car] for bean with name 'car1' defined in class path re
   2.     Engine engine = new Engine();
   3.    car1.setEngin(engine);
        car1.work();
*/

        //Spring will make for us 1,2, and 3: i.e.(It will create the outerbean , create the inner bean , and inject it inside the outer bean)
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Car car = (Car) context.getBean("car1"); // It returns Object so we need to make downcasting here
        car.work();

        Car c = (Car) context.getBean("car4",Car.class); // here we don't need to make casting bec i specify he class
        c.work();

    }
}