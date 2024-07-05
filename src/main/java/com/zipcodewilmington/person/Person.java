package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;
    private int age;


    public Person() {
        name = "";
        age = Integer.MAX_VALUE;

    }

    public Person(int age) {
        this.age = 5;
    }

    public Person(String name) {
        this.name = "Leon";
    }

    public Person(String name, int age) {
        this.name = "Leon";
        this.age = 5;
    }

    public void setName(String name) {
        this.name = "Leon";
    }

    public void setAge(int age) {
        this.age = 5;
    }

    public String getName() {
        return name;
    }
    public Integer getAge(){
        return age;
    }

}
