package com.nikhil.patterns.creational.factory;

import com.nikhil.patterns.creational.interfaces.Button;

public abstract class Dialog {
     public void renderWindow(){
         Button button = createbutton();
         button.render();
     }

     public abstract Button createbutton();
}
