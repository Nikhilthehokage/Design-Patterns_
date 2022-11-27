package com.nikhil.patterns.creational.factory;

import com.nikhil.patterns.creational.interface_impl.HtmlButton;
import com.nikhil.patterns.creational.interfaces.Button;

public class HtmlDialog extends Dialog{
    @Override
    public Button createbutton() {
        return new HtmlButton();
    }
}
