package com.mineshaftersquared.util;

public class Logger {
	
	private static String logName = "[Mineshafter Squared]";
	
	public static void log(String output)
	{
		System.out.println(logName + " " + output);
	}
}
