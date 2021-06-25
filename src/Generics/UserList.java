package Generics;

public class UserList implements Comparable<T> {
	private final User[] items = new User[10];
	private int count;
	
	public void add(User user) {
		items[count++] = user;
	}
	
	public User get(int index) {
		return items[index];
	}
}
