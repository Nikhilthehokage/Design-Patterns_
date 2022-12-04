package com.nikhil.patterns.creational.abstract_fatory.interface_impl;

import com.nikhil.patterns.creational.abstract_fatory.interfaces.Button;
import com.nikhil.patterns.creational.abstract_fatory.interfaces.Checkbox;
import com.nikhil.patterns.creational.abstract_fatory.interfaces.GUIFactory;

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckBox();
    }
}
