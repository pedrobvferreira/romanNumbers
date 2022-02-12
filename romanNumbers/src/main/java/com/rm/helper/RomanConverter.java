package com.rm.helper;

import com.rm.enumeration.RomanNumEnum;

public abstract class RomanConverter {	
	public static int romanToInteger(String romanNumber) {
		int result = 0;
		String upperCaseNumber = romanNumber.toUpperCase();
		for (int i = 0; i < upperCaseNumber.length(); i++) {
			char ch = upperCaseNumber.charAt(i); // Current Roman Character

			// Case 1
			if (i > 0 && RomanNumEnum.get(ch) > RomanNumEnum.get(upperCaseNumber.charAt(i - 1))) {
				result += RomanNumEnum.get(ch) - 2 * RomanNumEnum.get(upperCaseNumber.charAt(i - 1));
			}

			// Case 2: just add the corresponding number to result.
			else {
				result += RomanNumEnum.get(ch);
			}
		}
		return result;
	}

}
