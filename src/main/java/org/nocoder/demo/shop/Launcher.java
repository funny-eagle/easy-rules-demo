package org.nocoder.demo.shop;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.mvel.MVELRule;
import org.jeasy.rules.mvel.MVELRuleFactory;
import org.jeasy.rules.support.reader.YamlRuleDefinitionReader;

import java.io.FileReader;

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
        Rule ageRule = new MVELRule()
                .name("age rule")
                .description("check if person's age is > 18 and marks the person as adult")
                .priority(1)
                .when("person.age > 18")
                .then("person.setAdult(true);");

        MVELRuleFactory mvelRuleFactory = new MVELRuleFactory(new YamlRuleDefinitionReader());
        Rule alcoholRule = mvelRuleFactory.createRule(new FileReader("/Users/yangjl/local/github/easy-rules-demo/src/main/java/org/nocoder/demo/shop/alcohol-rule.yml"));

        Rules rules = new Rules();
        rules.register(ageRule);
        rules.register(alcoholRule);

        RulesEngine rulesEngine = new DefaultRulesEngine();
        System.out.println("Tom: Hi! can I have some Vodka please?");
        rulesEngine.fire(rules, facts);

    }
}
