package com.nikhil.patterns.creational.abstract_fatory;

import com.nikhil.patterns.creational.abstract_fatory.interfaces.Button;
import com.nikhil.patterns.creational.abstract_fatory.interfaces.Checkbox;
import com.nikhil.patterns.creational.abstract_fatory.interfaces.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
