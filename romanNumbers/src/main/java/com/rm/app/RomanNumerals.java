package com.rm.app;

import java.util.Scanner;

import com.rm.helper.InputUtils;
import com.rm.helper.RomanConverter;

public class RomanNumerals {
	
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Roman Number: ");
		
		String number = in.nextLine();
		if (!InputUtils.isEmpty(number) && InputUtils.isNotNumeric(number) && 
			InputUtils.isNotDouble(number) && InputUtils.isNotFloat(number)) {
			int result = RomanConverter.romanToInteger(number);
		    System.out.println("Input Integer Value is: "+ result);
		} else {
			System.out.println("Cant convert the number!");
		}
	}
}
