package com.bridgrlabz.factorypattern;

import com.bridgelabz.factory.Android;
import com.bridgelabz.factory.OperatingSystem;
import com.bridgelabz.factory.OperatingSystemFactory;

public class FactoryMain {
	public static void main(String[] args) {
		OperatingSystem obj = new Android();
		obj.spec();

		OperatingSystemFactory osf = new OperatingSystemFactory();
		OperatingSystem obj1 = osf.getInstance("Close");
		obj1.spec();
	}
}
