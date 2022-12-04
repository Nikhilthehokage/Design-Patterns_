package com.nikhil.patterns.creational.abstract_fatory.interface_impl;

import com.nikhil.patterns.creational.abstract_fatory.interfaces.Button;
import com.nikhil.patterns.creational.abstract_fatory.interfaces.Checkbox;
import com.nikhil.patterns.creational.abstract_fatory.interfaces.GUIFactory;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WinCheckBox();
    }
}
