package com.rm.helper;

public abstract class InputUtils {
	
	public static boolean isEmpty(String string) {
		if (string == null || string.equals("")) {
			return true;
		}
		return false;
	}

	public static boolean isNotNumeric(String string) {
	    try {
	    	Integer.parseInt(string);
	        return false;
	    } catch (NumberFormatException e) {
	    }
	    return true;
	}
	
	public static boolean isNotDouble(String string) {
		try {
			Double.parseDouble(string);
	        return false;
		} catch (NumberFormatException e) {
		}
		return true;
	}
	
	public static boolean isNotFloat(String string) {
		try {
			Float.parseFloat(string);
			return false;
		} catch (NumberFormatException e) {
		}
		return true;
	}
}
