package LambdasAndFunctionalInterface;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;


public class LambdaDemo {

//	public static String prefix = "++";

//	public static void print(String message) {
//		System.out.println(message);
//	}

	public void print(String message) {
		System.out.println(message);
	}

	public LambdaDemo(String message) {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void show() {

//		String prefix = "--";
//		
//		greet(new ConsolePrinter());
//		// Anonymous inner class
//		greet(new Printer() {
//			@Override
//			public void print(String message) {
//				System.out.println(message);
//			}
//		});
//		// Lambda expression - anonymous funtion
//		greet(message -> System.out.println(prefix + message));
//		
//		// method reference
//		// Class/Object::method
//		greet(System.out::println);
//		
//		Printer printer = message -> System.out.println(message);
//		greet(printer);

//		// method reference
//		greet(message -> print(message));
//		
//		// Class/Object::method
//		greet(LambdaDemo::print);

//		var demo = new LambdaDemo();
//		// Lambda expression
//		greet(message -> demo.print(message));
//		// Class/Object::method
//		greet(demo::print);

//		greet(message -> new LambdaDemo(message));
//		greet(LambdaDemo::new);

//		List<Integer> list = List.of(1, 2, 3);
//
//		// imperative progamming (for, if else, switch case, ....) - how?
//		for (var item : list) {
//			System.out.println(item);
//		}
//
//		// declarative - what?
//		list.forEach((item) -> System.out.println(item));
//		
//		list.forEach(System.out::println);
		
		
//		List<String> listList = List.of("a", "b", "c");
//		
//		Consumer<String> print = item -> System.out.println(item);
//		
//		Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//		
//		listList.forEach(print); //abc
//		listList.forEach(print
//				.andThen(printUpperCase)
//				.andThen(print)); // aAabBbcCc
//		listList.forEach(printUpperCase); //ABC
		
		
		
//		Supplier<Double> getRandom = () -> Math.random();
//		
//		var random = getRandom.get();
//		System.out.println(random);
		
//		UnaryOperator<Integer> square = n -> n * n;
//		UnaryOperator<Integer> increment = n -> n + 1;
//		
//		var result = increment.andThen(square).apply(1);
//		System.out.println(result);
		
	}

	public static void greet(Printer printer) {
		printer.print("Hello Viet Nam");
	}
}
