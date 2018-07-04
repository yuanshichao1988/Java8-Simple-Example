package com.ysc.java8.references.constructor;

import com.ysc.java8.functionalinterface.Converter;
import com.ysc.java8.references.Person;
import org.junit.Test;

import java.util.Random;
import java.util.function.BiFunction;

/**
 * @author YSC
 * Date ： 2018/6/26 11:35
 * Description :
 * Since:1.0
 */
public class ConstructorReferenceTest {

    @Test
    public void methodTest_1() {
        ConstructorReference cm = new ConstructorReference();
        BiFunction<String, Integer, String> startsWith = cm::startsWith;
        String s = "Java";
        for (int i = 0; i < 10; i++) {
            int index = new Random().nextInt(s.length());
            System.out.println(startsWith.apply(s, index));
        }
    }

    @Test
    public void methodTest_2() {
        ConstructorReference cm = new ConstructorReference();
        Converter<String, String> converter = cm::startsWith;
        System.out.println(converter.convert("Java"));
    }

    @Test
    public void methodTest_3() {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        System.out.println(person);
    }

}
