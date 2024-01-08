package br.com.banco.exception;

public class IllegalMathConversion extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public IllegalMathConversion(String message) {
		super(message);
	}
}
