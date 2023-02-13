package com.design.pattern.AbstractFactoryPattern;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows checkbox");
    }

    @Override
    public void onSelect() {
        System.out.println("Windows checkbox selected");
    }
}
