package org.nocoder.demo.fizzbuzz.rule;

import org.jeasy.rules.support.composite.UnitRuleGroup;

/**
 * @author yangjl
 * @description fizz buzz rule
 * @date 2022-08-01 21:58
 **/
public class FizzBuzzRule extends UnitRuleGroup {

    public FizzBuzzRule(Object... rules){
        for(Object rule: rules){
            addRule(rule);
        }
    }

    @Override
    public int getPriority(){
        return 0;
    }
}
