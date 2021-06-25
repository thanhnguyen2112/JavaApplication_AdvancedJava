package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class QueueDemo {
	public static void show() {
		Queue<String> queue = new ArrayDeque<>();
		queue.add("c");
		queue.add("a");
		queue.add("b");
		//c-a-b
		System.out.println(queue);
		
		queue.offer("d");
		System.out.println(queue);
		
		var front = queue.peek();
		System.out.println(front); // return null
		
		System.out.println(queue.element()); // return exception
		
		queue.remove();
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
		
	}
}
