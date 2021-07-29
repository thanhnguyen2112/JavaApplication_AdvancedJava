package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionDemo.show();
		System.out.println("-----------------------");
		ListDemo.show();
		System.out.println("-----------------------");
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("B", "e3"));
		customers.add(new Customer("A", "e2"));
		customers.add(new Customer("C", "e1"));
		
//		Collections.sort(customers);
		
		Collections.sort(customers, new EmailComparator());
		
		System.out.println(customers);
		
		System.out.println("-----------------------");
		
		
		QueueDemo.show();
		System.out.println("-----------------------");
		
		SetDemo.show();
		System.out.println("-----------------------");
		
		MapDemo.show();
		System.out.println("-----------------------");
	}

}
