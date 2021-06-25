package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
	public static void show() {
		Collection<String> collection = new ArrayList<>();
		collection.add("A");
		collection.add("B");
		collection.add("C");
		
		for (String string : collection) {
			System.out.println(string);
		}
		System.out.println(collection);
		
		Collections.addAll(collection, "1", "2", "3");
		System.out.println(collection);
		
		System.out.println(collection.size());
		
		collection.remove("A");
		System.out.println(collection);
		
		
//		remove all
//		collection.clear();
		
		System.out.println(collection.isEmpty());
		
		
		System.out.println(collection.contains("B"));
		
		Object[] objectArray = collection.toArray();
		
		String[] strArray = collection.toArray(new String[0]);
//		System.out.println(strArray);
		System.out.println(strArray[0].toUpperCase()); //giatri vi tri 0->B
		System.out.println(strArray[0].toLowerCase());
		
		Collection<String> other = new ArrayList<>();
		
		other.addAll(collection);
		
		System.out.println(collection == other);
		System.out.println(collection.equals(other));
	}
}
