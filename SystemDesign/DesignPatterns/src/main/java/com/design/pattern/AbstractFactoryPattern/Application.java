package com.design.pattern.AbstractFactoryPattern;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }

    public void onButtonClick() {
        button.onClick();
    }

    public void onCheckboxSelect() {
        checkbox.onSelect();
    }
}
