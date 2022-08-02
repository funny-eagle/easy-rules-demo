package org.nocoder.demo.fizzbuzz.rule;

import org.jeasy.rules.annotation.*;

/**
 * This tutorial implements the FizzBuzz application with Easy Rules. FizzBuzz is a simple application that requires to count from 1 to 100 and:
 * <p>
 * print "fizz" if the number is multiple of 5
 * print "buzz" if the number is multiple of 7
 * print "fizzbuzz" if the number is multiple of 5 and 7
 * print the number itself otherwise
 *
 * @author yangjl
 * @description fizz rule
 * @date 2022-08-01 21:57
 **/
@Rule
public class FizzRule {

    @Condition
    public boolean isFizz(@Fact("number") Integer number) {
        return number % 5 == 0;
    }

    @Action
    public void printFizz() {
        System.out.println("fizz");
    }

    @Priority
    public int getPriority() {
        return 1;
    }
}
