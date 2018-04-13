package com.eric.lambda;

public class First {

	/**
	 * 測試Lambda環境
	 * @param args
	 */
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("我的第一個Lambda測試");
		r.run();
	}
}
