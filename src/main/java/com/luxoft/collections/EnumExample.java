package com.luxoft.collections;

 public enum EnumExample {

    APPLE("red", 10),
    ORANGE("orange", 12),
    BANANA("yellow", 15);



    private String color;
    private int price;


    EnumExample(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }


}
