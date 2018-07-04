package com.ysc.java8.references.constructor;

import com.ysc.java8.references.Person;

/**
 * @author YSC
 * Date ： 2018/6/26 11:45
 * Description :
 * Since:1.0
 */
public interface PersonFactory<P extends Person> {

    /**
     * A + B
     *
     * @param firstName
     * @param lastName
     * @return
     */
    P create(String firstName, String lastName);

}
