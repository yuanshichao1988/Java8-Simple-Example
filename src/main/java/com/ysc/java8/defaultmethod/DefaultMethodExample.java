package com.ysc.java8.defaultmethod;

/**
 * @author YSC
 * Date ： 2018/6/26 10:16
 * Description :
 * Since:1.0
 */
public interface DefaultMethodExample {

    String PREFIX = "Hello, ";

    /**
     * 普通方法
     *
     * @param s
     * @return
     */
    String normalMethod(String s);

    /**
     * JAVA8 interface default 方法
     *
     * @param s
     * @return
     */
    default String defaultMethod(String s) {
        return PREFIX + s;
    }

}
