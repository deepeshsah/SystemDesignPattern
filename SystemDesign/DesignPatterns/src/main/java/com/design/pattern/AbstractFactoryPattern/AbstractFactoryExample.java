package com.design.pattern.AbstractFactoryPattern;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        // Create a Windows GUI
        GUIFactory windowsFactory = new WindowsGUIFactory();
        Application windowsApplication = new Application(windowsFactory);
        windowsApplication.render();
        windowsApplication.onButtonClick();
        windowsApplication.onCheckboxSelect();
        // Create a Mac GUI
        GUIFactory macFactory = new MacGUIFactory();
        Application macApplication = new Application(macFactory);
        macApplication.render();
        macApplication.onButtonClick();
        macApplication.onCheckboxSelect();
    }
}