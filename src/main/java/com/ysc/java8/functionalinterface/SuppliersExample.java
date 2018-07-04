package com.ysc.java8.functionalinterface;

import com.ysc.java8.references.Person;

import java.util.function.Supplier;

/**
 * @author YSC
 * Date ： 2018/6/26 14:50
 * Description :
 * Since:1.0
 */
public class SuppliersExample {

    public static Supplier<Person> personSupplier = Person::new;

    public Person get(Supplier<Person> supplier) {
        Person p = supplier.get();
        if (p.getFirstName() == null || p.getLastName() == null) {
            p.setFirstName("Mike");
            p.setLastName("James");
        }
        return p;
    }

}
