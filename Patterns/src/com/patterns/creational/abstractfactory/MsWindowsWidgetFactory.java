package com.patterns.creational.abstractfactory;

//ConcreteFactory1
public class MsWindowsWidgetFactory implements AbstractWidgetFactory {

	@Override
	public Window createWindow() {
		MSWindow window = new MSWindow();
		return window;
	}

}
