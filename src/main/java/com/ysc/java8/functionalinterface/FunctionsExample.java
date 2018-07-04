package com.ysc.java8.functionalinterface;

import java.util.function.Function;

/**
 * @author YSC
 * Date ： 2018/6/26 14:39
 * Description :
 * Since:1.0
 */
public class FunctionsExample {

    public String apply(String s) {
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        return backToString.apply(s);
    }
}
