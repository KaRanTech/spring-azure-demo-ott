package com.karan.ottplatfrom.com.karan.ottplatfrom.constants;

public enum Subscription {
    DISNEY("DISNEY"),
    APPLE_MUSIC("APPLE_MUSIC"),
    NETFLIX("NETFLIX");
    private String name;
    Subscription(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}
