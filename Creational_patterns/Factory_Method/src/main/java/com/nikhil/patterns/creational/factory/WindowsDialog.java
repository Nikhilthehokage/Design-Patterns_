package com.nikhil.patterns.creational.factory;

import com.nikhil.patterns.creational.interface_impl.WindowsButton;
import com.nikhil.patterns.creational.interfaces.Button;

public class WindowsDialog extends Dialog{
    @Override
    public Button createbutton() {
        return new WindowsButton();
    }
}
