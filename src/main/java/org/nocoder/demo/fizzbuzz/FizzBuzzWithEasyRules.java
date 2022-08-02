package org.nocoder.demo.fizzbuzz;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.api.RulesEngineParameters;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.nocoder.demo.fizzbuzz.rule.BuzzRule;
import org.nocoder.demo.fizzbuzz.rule.FizzBuzzRule;
import org.nocoder.demo.fizzbuzz.rule.FizzRule;
import org.nocoder.demo.fizzbuzz.rule.NonFizzBuzzRule;

/**
 * @author yangjl
 * @description register these rules in a rules set and fire them using a rules engine
 * @date 2022-08-02 09:13
 **/
public class FizzBuzzWithEasyRules {
    public static void main(String[] args) {
        // create a rules engine
        // Note that we have set the skipOnFirstAppliedRule parameter to skip subsequent rules whenever a rule is applied.
        RulesEngineParameters parameters = new RulesEngineParameters().skipOnFirstAppliedRule(true);
        RulesEngine fizzBuzzEngine = new DefaultRulesEngine(parameters);

        // create rules
        Rules rules = new Rules();
        rules.register(new FizzRule());
        rules.register(new BuzzRule());
        rules.register(new FizzBuzzRule(new FizzRule(), new BuzzRule()));
        rules.register(new NonFizzBuzzRule());

        // fire rules
        Facts facts = new Facts();
        for (int i = 1; i <= 100; i++) {
            facts.put("number", i);
            fizzBuzzEngine.fire(rules, facts);
            System.out.println();
        }
    }
}
