package LambdasAndFunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
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
		

		// Function
		
		
		Function<String, Integer> map = str -> str.length();
		
		var length = map.apply("Testing");
		System.out.println(length);
		
		
		
		// "key:value"
		// "key=value" 1st
		// "{key=value}" 2nd
		
		Function<String, String> replaceColon = str -> str.replace(":", "=");
		Function<String, String> addBraces = str -> "{" + str + "}";
		
		var result = replaceColon.andThen(addBraces).apply("key:value");
		System.out.println(result);
		
		//2nd
		result = addBraces.compose(replaceColon).apply("key2:value2");
		System.out.println(result);
		
		//Predicate
		
		Predicate<String> isLongerThan5 = str -> str.length() > 5;
		
		var resultPre = isLongerThan5.test("Test");
		System.out.println(resultPre); // ->false
		
		Predicate<String> hasLeftBrace = str -> str.startsWith("{");
		Predicate<String> hasRightBrace = str -> str.endsWith("}");
		
		// and() &&
		Predicate<String> has1 = hasLeftBrace.and(hasRightBrace);
		var result1 = has1.test("{key:value}"); //{}
		System.out.println(result1);
		
		// or() ||
		Predicate<String> has2 = hasLeftBrace.or(hasRightBrace);
		var result2 = has2.test("{key:value}"); // { or }
		System.out.println(result2);
		
		// negate() !
		Predicate<String> has3 = hasLeftBrace.negate();
		var result3 = has3.test("{key:value}"); // not
		System.out.println(result3);
		
		// BinaryOperator
		BinaryOperator<Integer> add = (a, b) -> a + b;
		var result4 = add.apply(3, 5);
		System.out.println(result4);
		
		// IntBinaryOperator
		IntBinaryOperator add2 = (a, b) -> a * b;
		System.out.println(add2.applyAsInt(5, 9));
		
		//
		Function<Integer, Integer> square = a -> a * a;
		System.out.println(add.andThen(square).apply(2, 3)); //(2+3)^2
		
		
		
		UnaryOperator<Integer> squaree = n -> n * n; // 2^2=4
		UnaryOperator<Integer> increment = n -> n + 1; //1+1=2
		
		var result5 = increment.andThen(squaree).apply(1);
		System.out.println(result5); // ->4
		
	}

	public static void greet(Printer printer) {
		printer.print("Hello Viet Nam");
	}
}
