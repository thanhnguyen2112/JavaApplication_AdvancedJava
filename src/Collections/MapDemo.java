package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapDemo {
	public static void show() {
//		List<Customer> customers = new ArrayList<>();
//		
//		//find customer with email = "e1"
//		for (var customer : customers) {
//			if (customer.getEmail() == "e1") {
//				System.out.println("Found!");
//			}
//		}
		Map<String, Customer> map = new HashMap<>();
		
		var c1 = new Customer("a", "e1");
		var c2 = new Customer("b", "e2");
		
		map.put(c1.getEmail(), c1);
		map.put(c2.getEmail(), c2);
		
		//get()
		var m1 = map.get("e1");
		System.out.println(m1); //=> a
		System.out.println(map.get("e3")); //=> null
		
		//
		var False = new Customer("False", "");
		System.out.println(map.getOrDefault("e3", False));
		
		//
		System.out.println(map.containsKey("e1"));
		
		//
		map.replace("e1", new Customer("abc", "e1"));
		System.out.println(map);
		
		//
		for (var key : map.keySet()) {
			System.out.println(key);
		}
		
		for (var entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		for (var value : map.values()) {
			System.out.println(value);
		}
		
		for (var entry : map.entrySet()) {
			System.out.println(entry.getValue());
		}
		
		
	}
}
