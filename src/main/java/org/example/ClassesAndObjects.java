package org.example;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLOutput;

import static org.example.Main.logger;

public class ClassesAndObjects {

    static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(12);
        System.out.println("Print digit in main metod: " + person1.getName());
        System.out.println("Print digit in main metod: " + person1.getAge());
        person1.getAge();
        person1.speak();


    }




}

class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("You entred empty name ");
        } else {
            name = userName;
        }
    }

    public String getName() {

        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Your age must be more than 0 ");

        } else {
            age = userAge;
        }

    }

    public int getAge() {
        return age;
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ", im " + age + " years ald");
        }
    }

    public int multiTeni(int n) {
        logger.log(Level.INFO, "in method");
        return n * 10;
    }

}
