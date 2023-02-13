package com.design.pattern.AbstractFactoryPattern;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Mac checkbox");
    }

    @Override
    public void onSelect() {
        System.out.println("Mac checkbox selected");
    }
}