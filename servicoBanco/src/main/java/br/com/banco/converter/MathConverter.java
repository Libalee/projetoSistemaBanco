package br.com.banco.converter;

import java.util.Locale;

import br.com.banco.exception.IllegalMathConversion;

public class MathConverter {

	
	public static Long convertLong(String string) {
		if(isNumeric(string)) {
			return Long.parseLong(string);
		} else {
			throw new IllegalMathConversion("String is not numeric");
		}
	}
	
	
	public static boolean isNumeric(String string) {
		Locale.setDefault(Locale.US);
		
		string = string.replace(',', '.');
		
		try {
			Double.parseDouble(string);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
