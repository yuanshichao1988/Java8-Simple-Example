package com.ysc.java8.functionalinterface;

import com.ysc.java8.references.Person;

import java.util.Comparator;

/**
 * @author YSC
 * Date ： 2018/6/27 10:55
 * Description :
 * Since:1.0
 */
public class ComparatorsExample {

    public static Comparator<Person> comparator = Comparator.comparing(Person::getFirstName);

    public static Comparator<Person> getComparator() {
        return comparator;
    }

}
