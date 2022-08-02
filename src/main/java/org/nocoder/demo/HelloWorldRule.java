package org.nocoder.demo;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;

/**
 * @author yangjl
 * @description hello world rule
 * @date 2022-08-01 21:34
 **/
@Rule(name = "Hello World rule", description = "Always say hello world")
public class HelloWorldRule {

    @Condition
    public boolean when(){
        return true;
    }

    @Action
    public void then() throws Exception{
        System.out.println("hello world!");
    }
}
