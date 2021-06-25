package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionDemo.show();
		
		ListDemo.show();
		
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("B", "e3"));
		customers.add(new Customer("A", "e2"));
		customers.add(new Customer("C", "e1"));
		
//		Collections.sort(customers);
		
		Collections.sort(customers, new EmailComparator());
		
		System.out.println(customers);
		
		
		QueueDemo.show();
		
		SetDemo.show();
		
		MapDemo.show();
	}

}
