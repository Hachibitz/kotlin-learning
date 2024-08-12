package br.com.learning.kotlinOnJava;

import br.com.learning.oop.classes.Person;
import br.com.learning.oop.generic.MaxKt;

public class HelloKotlinFromJava {

    public static void main(String[] args) {

        Person rob = new Person("Robert", "Andrade");
        System.out.println("His name is: "+rob.getFirstName());

        rob.setFirstName("Roberto");
        System.out.println("His name is now: "+rob.getFirstName());

        Integer maxInt = MaxKt.max(2001,2024);
        System.out.println("The max value is: "+maxInt);

    }
}
