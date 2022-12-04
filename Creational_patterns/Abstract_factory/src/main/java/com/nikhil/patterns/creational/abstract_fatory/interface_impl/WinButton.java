package com.nikhil.patterns.creational.abstract_fatory.interface_impl;

import com.nikhil.patterns.creational.abstract_fatory.interfaces.Button;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("This is WinButton");
    }
}
