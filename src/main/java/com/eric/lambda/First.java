package com.eric.lambda;

import java.util.HashMap;
import java.util.Map;

public class First {

	/**
	 * 測試Lambda環境
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Object> tmp = new HashMap<>();
		tmp.put("aaa", "123");
		Runnable r = () -> System.out.println("我的第一個Lambda測試"+tmp.get("aaa"));
		r.run();
	}
}
