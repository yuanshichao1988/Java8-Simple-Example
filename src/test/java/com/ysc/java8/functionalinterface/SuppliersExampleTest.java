package com.ysc.java8.functionalinterface;

import org.junit.Test;

/**
 * @author YSC
 * Date ： 2018/6/26 14:50
 * Description :
 * Since:1.0
 */
public class SuppliersExampleTest {

    @Test
    public void get() {
        SuppliersExample example = new SuppliersExample();
        System.out.println(example.get(SuppliersExample.personSupplier));
    }

}
