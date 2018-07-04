package com.ysc.java8.functionalinterface;

import com.ysc.java8.references.Person;
import org.junit.Test;

/**
 * @author YSC
 * Date ： 2018/6/27 10:55
 * Description :
 * Since:1.0
 */
public class ComparatorsExampleTest {

    @Test
    public void comparatorTest() {
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");
        System.out.println(ComparatorsExample.getComparator().compare(p1, p2));
        System.out.println(ComparatorsExample.getComparator().reversed().compare(p1, p2));
    }

}
