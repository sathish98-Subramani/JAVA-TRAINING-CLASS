package com.service;

public interface CalculatorService {
	void divide(Integer... array);
	// varargs (variable arguments).
	// It lets you pass zero or more arguments of the given type into a method.
	// Inside the method, Java treats them as an array.
}
