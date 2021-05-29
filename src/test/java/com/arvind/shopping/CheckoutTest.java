package com.arvind.shopping;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.stream.Stream;

import static com.arvind.shopping.utils.PricingRule.getPricingRules;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckoutTest {
    private Checkout checkout;

    @BeforeEach
    void setup() {
        checkout = new Checkout(getPricingRules());
    }

//    @Test
//    void shouldScanAndReturnTotal() {
//        checkout.scan("A");
//        checkout.scan("B");
//        checkout.scan("C");
//        checkout.scan("A");
//        checkout.scan("D");
//        checkout.scan("A");
//        checkout.scan("B");
//        checkout.scan("B");
//        checkout.scan("B");
//        checkout.scan("B");
//        assertEquals(285, checkout.total());
//    }


    @ParameterizedTest
    @CsvFileSource(resources = "/checkout.csv", numLinesToSkip = 1)
    void shouldScanAndReturnTotal(String scannedItems, Integer expectedPrice) {
        Stream.of(scannedItems.split(":", -1)).forEach(item -> checkout.scan(item));
        assertEquals(expectedPrice, checkout.total());
    }

}
