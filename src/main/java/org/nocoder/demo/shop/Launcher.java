package org.nocoder.demo.shop;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

/**
 * @author yangjl
 * @description fire
 * @date 2022-08-02 10:13
 **/
public class Launcher {
    public static void main(String[] args) throws Exception {
        // create a person instance(fact)
        Person tom = new Person("Tom", 14);
        Facts facts = new Facts();
        facts.put("person", tom);

        // create rules
        // create rule from class
        Rule ageRule = AgeRule.createAgeRule();
        // create rule from yaml
        Rule alcoholRule = AlcoholRule.createAlcoholRule();

        Rules rules = new Rules();
        rules.register(ageRule);
        rules.register(alcoholRule);

        RulesEngine rulesEngine = new DefaultRulesEngine();
        System.out.println("Tom: Hi! can I have some Vodka please?");
        rulesEngine.fire(rules, facts);

    }
}
