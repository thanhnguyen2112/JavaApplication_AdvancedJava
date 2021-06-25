package Collections;

public class Customer implements Comparable<Customer>{
	private String name;
	private String email;
	
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	
	
}
