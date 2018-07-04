package com.ysc.java8.references.method;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author YSC
 * Date ： 2018/6/26 11:27
 * Description :
 * Since:1.0
 */
public class MethodReferenceTest {

    @Test
    public void methodTest_1() {
        MethodReference mr = new MethodReference();
        System.out.println(mr.methodRef("5"));
        mr.print(Arrays.asList("Vue.js", "Spark", "dubbo", "springboot", "$%^&*", "Druid", "GitHub", "ALIBABA", "CTO"));
    }

}
