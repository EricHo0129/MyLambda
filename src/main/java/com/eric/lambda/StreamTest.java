package com.eric.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		listTest();
		keyOperation();
		togetherTest();
		minTest();
	}
	
	private static <T> List<T> asList(T...objs) {
		return Stream.of(objs).collect(Collectors.toList());
	}
	
	private static void listTest() {
		List<Object> list = asList("a","b","c");
		System.out.println(list.get(1));
		System.out.println(Stream.of("a","b","c").count());
	}
	
	private static void keyOperation() {
		List<String> list = 
				Stream.of("eric","jeremy","chonpin")
				.filter(name -> !name.equals("eric"))
				.map(key -> key.toUpperCase())
				.collect(Collectors.toList());
		System.out.println("size:"+list.size());
		System.out.println("0:"+list.get(0));
		System.out.println("1:"+list.get(1));
	}
	
	private static void togetherTest() {
		List<Integer> list = Stream.of(asList(1,2), asList(3,4))
				.flatMap(numbers -> numbers.stream())
				.collect(Collectors.toList());
		System.out.println("size:"+list.size());
	}
	
	private static void minTest() {
		List<String> names = asList("eric","jeremy","chonpin");
		String shortest = names.stream().min(Comparator.comparing(name -> name.toString().length())).get();
		System.out.println("Shortest name: "+shortest);
	}
}
