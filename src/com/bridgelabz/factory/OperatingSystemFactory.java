package com.bridgelabz.factory;

public class OperatingSystemFactory {
	public OperatingSystem getInstance(String str) {
		if (str.equals("Open"))
			return new Android();
		else if (str.equals("Close"))
			return new IphoneOS();
		else
			return new Windows();
	}
}
