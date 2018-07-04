package com.ysc.java8.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * @author YSC
 * Date ： 2018/6/27 11:03
 * Description :
 * Since:1.0
 */
public class OptionalExampleTest {

    @Test
    public void test() {
        OptionalExample example = new OptionalExample();
        Optional<String> notNull = example.getNotNull();
        Optional<String> nullable = example.getNullable();
        Optional<String> empty = example.getEmpty();

        System.out.println(notNull.isPresent());
        System.out.println(notNull.get());
        System.out.println(notNull.orElse("notNull"));
        notNull.ifPresent((s) -> System.out.println(s.charAt(0)));

        System.out.println(nullable.isPresent());
        if (nullable.isPresent()) {
            System.out.println(nullable.get());
        }
        System.out.println(nullable.orElse("nullable"));
        nullable.ifPresent((s) -> System.out.println(s.charAt(0)));

        System.out.println(empty.isPresent());
        if (empty.isPresent()) {
            System.out.println(nullable.get());
        }
        System.out.println(empty.orElse("empty"));
        empty.ifPresent((s) -> System.out.println(s.charAt(0)));

    }

}
