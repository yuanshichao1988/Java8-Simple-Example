package com.ysc.java8.references.method;

import com.ysc.java8.functionalinterface.Converter;

import java.util.List;

/**
 * @author YSC
 * Date ： 2018/6/26 11:24
 * Description :
 * Since:1.0
 */
public class MethodReference {

    public Integer methodRef(String s) {
        Converter<String, Integer> converter = Integer::valueOf;
        return converter.convert(s);
    }

    public void print(List<String> list) {
        list.forEach(System.out::println);
    }

}
