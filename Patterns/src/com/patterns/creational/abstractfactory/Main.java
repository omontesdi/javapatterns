package com.patterns.creational.abstractfactory;

/***
 * https://dzone.com/articles/design-patterns-abstract-factory
 * @author oscar
 *
 */
public class Main {
	
	private static final String PLATFORM = "MACOSX";

	public static void main(String[] args) {
		GUIBuilder builder = new GUIBuilder();
		AbstractWidgetFactory widgetFactory = null;
		
		//Check what platform we're on
		if(PLATFORM.equals("MACOSX")) {
			widgetFactory = new MacOSXWindowsWidgetFactory();
		} else {
			widgetFactory = new MsWindowsWidgetFactory();
		}
		builder.buildWindow(widgetFactory);

	}

}
