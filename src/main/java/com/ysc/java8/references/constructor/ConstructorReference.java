package com.ysc.java8.references.constructor;

/**
 * @author YSC
 * Date ： 2018/6/26 11:31
 * Description :
 * Since:1.0
 */
public class ConstructorReference {

    public String startsWith(String s, int index) {
        int len = s.length();
        if (index >= len) {
            index = 0;
        }
        return String.valueOf(s.charAt(index));
    }

    public String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }

}
