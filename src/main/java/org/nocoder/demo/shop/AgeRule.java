package org.nocoder.demo.shop;

import org.jeasy.rules.api.Rule;
import org.jeasy.rules.mvel.MVELRule;

/**
 * @author yangjl
 * @description age rule
 * @date 2022-08-02 11:50
 **/
public class AgeRule {
    private AgeRule() {
    }

    public static Rule createAgeRule() {
        return new MVELRule()
                .name("age rule")
                .description("check if person's age is > 18 and marks the person as adult")
                .priority(1)
                .when("person.age > 18")
                .then("person.setAdult(true);");
    }
}
