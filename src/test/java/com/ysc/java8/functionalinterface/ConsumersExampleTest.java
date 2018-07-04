package com.ysc.java8.functionalinterface;

import org.junit.Test;

/**
 * @author YSC
 * Date ： 2018/6/27 10:52
 * Description :
 * Since:1.0
 */
public class ConsumersExampleTest {

    @Test
    public void consumerTest() {
        ConsumersExample example = new ConsumersExample();
        example.print(ConsumersExample.greeter);
    }
}
