package com.arvind.shopping.domain;

public class Goods {
    private String item;
    private Integer unitPrice;
    private SpecialPrice specialPrice;

    public String getItem() {
        return item;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public SpecialPrice getSpecialPrice() {
        return specialPrice;
    }

    public Goods withItem(String item) {
        this.item = item;
        return this;
    }

    public Goods witUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Goods withSpecialPrice(SpecialPrice specialPrice) {
        this.specialPrice = specialPrice;
        return this;
    }

}
