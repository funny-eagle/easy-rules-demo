package org.nocoder.demo.fizzbuzz.rule;

import org.jeasy.rules.annotation.*;

/**
 * @author yangjl
 * @description non fizz buzz rule
 * @date 2022-08-01 22:22
 **/
@Rule
public class NonFizzBuzzRule {
    @Condition
    public boolean isNotFizzNorBuzz(@Fact("number") Integer number) {
        return number % 5 != 0 || number % 7 != 0;
    }

    @Action
    public void printInput(@Fact("number") Integer number) {
        System.out.println(number);
    }

    @Priority
    public int getPriority() {
        return 3;
    }
}
