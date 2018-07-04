package com.ysc.java8.functionalinterface;

/**
 * @author YSC
 * Date ： 2018/6/26 11:06
 * Description :
 * Since:1.0
 */
@FunctionalInterface
public interface Converter<F, T> {

    /**
     * convert
     *
     * @param from
     * @return
     */
    T convert(F from);

}
