package com.ysc.java8.defaultmethod;

import org.junit.Test;

import java.util.Random;

/**
 * @author YSC
 * Date ： 2018/6/26 10:16
 * Description :
 * Since:1.0
 */
public class DefaultMethodExampleTest {

    @Test
    public void normalMethodT_1() {
        DefaultMethodExample example = new DefaultMethodExampleImpl();
        System.out.println(example.normalMethod("java8"));
        System.out.println(example.defaultMethod("java8"));
    }

    @Test
    public void normalMethodT_2() {

        final String str = "换套路了,";

        DefaultMethodExample example = new DefaultMethodExample() {

            @Override
            public String normalMethod(String s) {
                return str + s;
            }

            @Override
            public String defaultMethod(String s) {
                return str + new Random().nextInt() + s;
            }

        };

        System.out.println(example.normalMethod("java8"));
        System.out.println(example.defaultMethod(String.valueOf(System.currentTimeMillis())));

    }


    static class DefaultMethodExampleImpl implements DefaultMethodExample {

        @Override
        public String normalMethod(String s) {
            return DefaultMethodExample.PREFIX + s;
        }

    }

}
