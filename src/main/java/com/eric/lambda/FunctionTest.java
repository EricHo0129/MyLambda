package com.eric.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class FunctionTest {

	public static void main(String[] args) {
		Predicate<Integer> pred = x -> x > 5;
		System.out.println(pred.test(6));
		BinaryOperator<Integer> bo = (x, y) -> x+y;
		System.out.println(bo.apply(4, 5));
	}
}
