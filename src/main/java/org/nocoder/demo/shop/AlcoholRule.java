package org.nocoder.demo.shop;

import org.jeasy.rules.api.Rule;
import org.jeasy.rules.mvel.MVELRuleFactory;
import org.jeasy.rules.support.reader.YamlRuleDefinitionReader;

import java.io.FileReader;

/**
 * @author yangjl
 * @description alcohol rule
 * @date 2022-08-02 11:54
 **/
public class AlcoholRule {
    private AlcoholRule() {
    }

    public static Rule createAlcoholRule() {
        MVELRuleFactory mvelRuleFactory = new MVELRuleFactory(new YamlRuleDefinitionReader());
        try {
            return mvelRuleFactory.createRule(new FileReader("/Users/yangjl/local/github/easy-rules-demo/src/main/java/org/nocoder/demo/shop/alcohol-rule.yml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
