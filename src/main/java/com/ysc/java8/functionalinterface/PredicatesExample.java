package com.ysc.java8.functionalinterface;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * @author YSC
 * Date ： 2018/6/26 13:57
 * Description :
 * Since:1.0
 */
public class PredicatesExample {

    public static Predicate<String> predicate = (s) -> s.length() > 0;
    public static Predicate<Boolean> nonNull = Objects::nonNull;
    public static Predicate<Boolean> isNull = Objects::isNull;
    public static Predicate<String> isEmpty = String::isEmpty;
    public static Predicate<String> isNotEmpty = isEmpty.negate();

    public boolean judge(Predicate condition, Object value) {
        return condition.test(value);
    }

}
