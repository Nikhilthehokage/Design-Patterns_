package com.nikhil.patterns.creational.abstract_fatory;

import com.nikhil.patterns.creational.abstract_fatory.interface_impl.MacFactory;
import com.nikhil.patterns.creational.abstract_fatory.interface_impl.WinFactory;
import com.nikhil.patterns.creational.abstract_fatory.interfaces.GUIFactory;

public class Demo {
    private static Application configureApplication(){
        Application app;
        GUIFactory guiFactory;
        String osName="win";
        if(osName.equals("mac")){
            guiFactory = new MacFactory();
        }else{
            guiFactory = new WinFactory();
        }
        app = new Application(guiFactory);
        return app;
    }

    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }


}
