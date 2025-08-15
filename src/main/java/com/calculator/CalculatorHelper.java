package com.calculator;

public class CalculatorHelper {

	public double calculate(String s) {
		if (s.contains("+")) {
			return add(s);
		}
		if (s.contains("-")) {
			return sub(s);
		}
		if (s.contains("÷")) {
			return divide(s);
		}
		if (s.contains("x")) {
			return multiply(s);
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
	
	public double sub(String s) {
		String[] nums = s.split("[-= ]+");
		double result = Double.parseDouble(nums[0]);
		for(int i = 1; i < nums.length;i++) {
			if (!(nums[i].isEmpty())) {
				result -= Double.parseDouble(nums[i]);
			}
		}
		return result;
	}
	
	public double divide(String s) {
		String[] nums = s.split("[=÷ ]+");
		Double result = Double.parseDouble(nums[0]);
		for(int i = 1; i < nums.length;i++) {
			if (!(nums[i].isEmpty())) {
				result /= Double.parseDouble(nums[i]);
			}
		}
		return result;
	}
	
	public double multiply(String s) {
		String[] nums = s.split("[=x ]+");
		double result = Double.parseDouble(nums[0]);
		for(int i = 1; i < nums.length;i++) {
			if (!(nums[i].isEmpty())) {
				result *= Double.parseDouble(nums[i]);
			}
		}
		return result;
	}
}
