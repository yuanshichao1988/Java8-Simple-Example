package com.ysc.java8.functionalinterface;

import org.junit.Test;

/**
 * @author YSC
 * Date ： 2018/6/26 11:07
 * Description :
 * Since:1.0
 */
public class ConverterTest {

    @Test
    public void testMethod_1() {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        System.out.println(converter.convert("123"));
    }

    @Test
    public void testMethod_2() {
        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }

    @Test
    public void testMethod_3() {
        Converter<String, Integer> converter = new ConverterImpl("2");
        System.out.println(converter.convert("123"));
        System.out.println(converter.convert("123x"));
    }

    static class ConverterImpl implements Converter<String, Integer> {

        private String str;

        public ConverterImpl(String str) {
            this.str = str;
        }

        @Override
        public Integer convert(String from) {
            try {
                return Integer.valueOf(from + str);
            } catch (NumberFormatException e) {
                return -1;
            }
        }

    }
}
