package com.ysc.java8.functionalinterface;

import com.ysc.java8.references.Person;

import java.util.function.Consumer;

/**
 * @author YSC
 * Date ： 2018/6/27 10:52
 * Description :
 * Since:1.0
 */
public class ConsumersExample {

    public static Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.getFirstName());

    public void print(Consumer<Person> greeter) {
        greeter.accept(new Person("Luke", "Skywalker"));
    }
}
