package org.nocoder.demo.fizzbuzz.rule;

import org.jeasy.rules.annotation.*;

/**
 * @author yangjl
 * @description buzz rule
 * @date 2022-08-01 21:57
 **/
@Rule
public class BuzzRule {

    @Condition
    public boolean isBuzz(@Fact("number") Integer number) {
        return number % 7 == 0;
    }

    @Action
    public void printBuzz() {
        System.out.println("buzz");
    }

    @Priority
    public int getPriority() {
        return 2;
    }
}
