package com.ysc.java8.functionalinterface;

import org.junit.Test;

/**
 * @author YSC
 * Date ： 2018/6/26 14:39
 * Description :
 * Since:1.0
 */
public class FunctionsExampleTest {

    @Test
    public void applyMethodTest() {
        FunctionsExample example = new FunctionsExample();
        System.out.println(example.apply("1"));
    }
}
