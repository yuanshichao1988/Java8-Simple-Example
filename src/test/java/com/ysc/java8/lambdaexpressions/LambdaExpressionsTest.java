package com.ysc.java8.lambdaexpressions;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author YSC
 * Date ： 2018/6/26 10:54
 * Description :
 * Since:1.0
 */
public class LambdaExpressionsTest {

    @Test
    public void lambdaT_1() {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        LambdaExpressionsExample example = new LambdaExpressionsExample();
        System.out.println(example.stringSort(names));
        System.out.println(example.stringSort(names, Comparator.reverseOrder()));
        System.out.println(example.stringSort(names, Comparator.naturalOrder()));
    }

    @Test
    public void lambdaT_2() {
        List<Integer> numbers = Arrays.asList(1, 13, 5, 7, 39, 11);
        LambdaExpressionsExample example = new LambdaExpressionsExample();
        System.out.println(example.integerSort(numbers, Comparator.naturalOrder()));
        System.out.println(example.integerSort(numbers, Comparator.reverseOrder()));
    }

}
