package com.arvind.shopping;

import com.arvind.shopping.domain.Goods;

import java.util.HashMap;
import java.util.Map;

public class Checkout {

    private Map<String, Goods> pricingRules;
    private HashMap<String, Integer> scannedItems = new HashMap<>();

    public Checkout(Map<String, Goods> pricingRules) {
        this.pricingRules = pricingRules;
    }


    public void scan(String item) {
        scannedItems.compute(item, (k, v) -> (v == null) ? 1 : v + 1);
    }

    public Integer total() {

        Integer total = 0;

        for (Map.Entry<String, Integer> entry : scannedItems.entrySet()) {
            var goods = pricingRules.get(entry.getKey());
            var quantityOfSameItemScanned = entry.getValue();
            if (goods.getSpecialPrice() != null) {
                var specialOfferQuantity = goods.getSpecialPrice().getQuantity();
                var specialOfferPrice = goods.getSpecialPrice().getPrice();
                total += (((quantityOfSameItemScanned / specialOfferQuantity) * specialOfferPrice) + ((quantityOfSameItemScanned % specialOfferQuantity) * goods.getUnitPrice()));
            } else {
                total += (quantityOfSameItemScanned * goods.getUnitPrice());
            }
        }
        return total;
    }
}
