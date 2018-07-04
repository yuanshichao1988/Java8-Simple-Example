package com.ysc.java8.lambdaexpressions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author YSC
 * Date ： 2018/6/26 10:50
 * Description :
 * Since:1.0
 */
public class LambdaExpressionsExample {

    /**
     * 对list进行排序
     *
     * @param list
     * @return
     */
    public List<String> stringSort(List<String> list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }

    /**
     * 对list进行排序
     *
     * @param list
     * @return
     */
    public List<String> stringSort(List<String> list, Comparator comparator) {
        Collections.sort(list, comparator);
        return list;
    }

    /**
     * 对list进行排序
     *
     * @param list
     * @return
     */
    public List<Integer> integerSort(List<Integer> list, Comparator comparator) {
        list.sort(comparator);
        return list;
    }

}
