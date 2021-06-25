package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	public static void show() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println(list);

		Collections.addAll(list, "d", "e", "f", "c");

		list.add(3, "AAA");
		System.out.println(list);

		System.out.println(list.get(3));

		list.set(2, "BBB");
		System.out.println(list);

		list.remove(0);
		list.remove("b");
		System.out.println(list);

		System.out.println(list.indexOf("d"));
		System.out.println(list.indexOf("s"));
		System.out.println(list.lastIndexOf("c"));

		System.out.println(list.subList(0, 3)); // 0-(3-1)
		
	}
}
