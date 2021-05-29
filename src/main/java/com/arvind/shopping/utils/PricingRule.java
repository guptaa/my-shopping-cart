package com.arvind.shopping.utils;

import com.arvind.shopping.domain.Goods;
import com.arvind.shopping.domain.SpecialPrice;

import java.util.Map;

public class PricingRule {

    private PricingRule() {
        //no instance allowed
    }

    public static Map<String, Goods> getPricingRules() {
        return Map.of("A", new Goods().withItem("A").witUnitPrice(50).withSpecialPrice(new SpecialPrice().withQuantity(3).withPrice(130)),
                "B", new Goods().withItem("B").witUnitPrice(30).withSpecialPrice(new SpecialPrice().withQuantity(2).withPrice(45)),
                "C", new Goods().withItem("C").witUnitPrice(20),
                "D", new Goods().withItem("D").witUnitPrice(15));
    }
}
