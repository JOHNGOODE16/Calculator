package com.calculator;

public class CalculatorHelper {

	public double calculate(String s) {
		if (s.contains("+")) {
			return add(s);
		}
		return 0;// Unsupported operation
	}

	public double add(String s) {
		double sum = 0;
		String[] nums = s.split("[+= ]+");
		for (String i : nums) {
			if (!i.isEmpty()) {
				sum += Double.parseDouble(i);
			}
		}

		return sum;
	}

}
