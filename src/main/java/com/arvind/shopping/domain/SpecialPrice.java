package com.arvind.shopping.domain;

public class SpecialPrice {
    private Integer quantity;
    private Integer price;

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public SpecialPrice withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public SpecialPrice withPrice(Integer price) {
        this.price = price;
        return this;
    }
}
