package com.sda.testingbasics.calculator;

public class Calculator {

	private Double lastAddResult;

	public double add(double a, double b) {
		double v = a + b;
		lastAddResult = v;
		return v;
	}

	public Double getLastAddResult() {
		return lastAddResult;
	}

}
