package com.nikhil.patterns.creational.abstract_fatory.interface_impl;

import com.nikhil.patterns.creational.abstract_fatory.interfaces.Checkbox;

public class MacCheckBox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("This is MacCheckbox");
    }
}
