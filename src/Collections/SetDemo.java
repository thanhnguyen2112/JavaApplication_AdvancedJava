package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void show() {
		Set<String> set1 = new HashSet<>();
		set1.add("sky");
		set1.add("is");
		set1.add("blue"); //unique
		set1.add("blue");
		
		System.out.println(set1);
		
		Collection<String> collection = new ArrayList<>();
		Collections.addAll(collection, "a", "b", "c", "c");
		
		Set<String> set2 = new HashSet<>(collection);
		System.out.println(set2);
		
		Set<String> set3 = new HashSet<>(Arrays.asList("a", "b", "c"));
		Set<String> set4 = new HashSet<>(Arrays.asList("b", "c", "d"));
		
		
//		// Union - hop nhau
//		set3.addAll(set4);
//		System.out.println(set3);
		
		// Intersection - giao nhau
//		set3.retainAll(set4);
//		System.out.println(set3);
		
		// Different
		set3.removeAll(set4);
		System.out.println(set3);
		
		
		
	}
}
