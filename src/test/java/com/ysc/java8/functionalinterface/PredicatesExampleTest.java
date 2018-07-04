package com.ysc.java8.functionalinterface;

import org.junit.Test;

/**
 * @author YSC
 * Date ： 2018/6/26 14:07
 * Description :
 * Since:1.0
 */
public class PredicatesExampleTest {

    @Test
    public void predicateTest_1() {
        PredicatesExample example = new PredicatesExample();
        System.out.println(example.judge(PredicatesExample.isEmpty, ""));
        System.out.println(example.judge(PredicatesExample.isNotEmpty, "1"));
        System.out.println(example.judge(PredicatesExample.isNull, null));
        System.out.println(example.judge(PredicatesExample.nonNull, null));
        System.out.println(example.judge(PredicatesExample.predicate, ""));
    }

    @Test
    public void predicateTest_2() {
        PredicatesExample example = new PredicatesExample();
        System.out.println(example.judge(PredicatesExample.isEmpty.negate(), ""));
        System.out.println(example.judge(PredicatesExample.isNotEmpty.and(PredicatesExample.predicate), "1"));
        System.out.println(example.judge(PredicatesExample.isNull.or(PredicatesExample.nonNull), null));
    }

}
