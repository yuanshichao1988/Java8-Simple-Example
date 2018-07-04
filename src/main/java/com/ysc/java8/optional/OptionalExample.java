package com.ysc.java8.optional;

import java.util.Optional;

/**
 * @author YSC
 * Date ： 2018/6/27 11:03
 * Description :
 * Since:1.0
 */
public class OptionalExample {

    public Optional<String> getNotNull() {
        return Optional.of("java8Optional");
    }

    public Optional<String> getNullable() {
        return Optional.ofNullable(null);
    }

    public Optional<String> getEmpty() {
        return Optional.empty();
    }

}
