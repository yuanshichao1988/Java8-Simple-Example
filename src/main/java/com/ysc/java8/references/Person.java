package com.ysc.java8.references;

/**
 * @author YSC
 * Date ： 2018/6/26 11:44
 * Description :
 * Since:1.0
 */
public class Person {

    private String firstName;
    private String lastName;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Hi, I am " + this.firstName + " " + this.lastName;
    }
}
