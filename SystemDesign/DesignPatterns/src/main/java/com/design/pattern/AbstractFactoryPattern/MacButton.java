package com.design.pattern.AbstractFactoryPattern;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac button");
    }

    @Override
    public void onClick() {
        System.out.println("Mac button clicked");
    }
}
