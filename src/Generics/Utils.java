package Generics;

public class Utils {
	public static int maxx(int first, int second) {
		return first > second ? first : second;
	}
	
	public static <T extends Comparable<T>> T max(T first, T second) {
		return (first.compareTo(second) < 0) ? second : first;
	}
	
	public static <K, V, T> void print(K key, V value, T test) {
		System.out.println(key + " + " + value + " = " + test);
	}
	
	public static void printUser(User user) {
		System.out.println(user);
	}
	
//	public static void printUsers(Generics<User> users) {
//		
//	}
	
//	public static void printUser (Generics<?> users) {
//		
//	}
	
	public static void printUser (Generics<? extends User> users) { // wildcard
		User user = users.get(0);
		
//		users.add(new User(10)); //extends -> super
	}
}
