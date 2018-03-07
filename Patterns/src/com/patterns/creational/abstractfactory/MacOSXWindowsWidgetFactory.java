package com.patterns.creational.abstractfactory;

//ConcreteFactory2
public class MacOSXWindowsWidgetFactory implements AbstractWidgetFactory {

	@Override
	public Window createWindow() {
		MacOSXWindow window = new MacOSXWindow();
		return window;
	}

}
