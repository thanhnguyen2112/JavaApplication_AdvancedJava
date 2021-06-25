package Generics;

public class Main {
	public static void main(String[] args) {
		
//		var list = new MyList();
//		list.add(1); //add (Integer.valueOf(1))   => boxing
//		list.add("Anh");
//		System.out.println(list);
//		
////		var userList = new UserList();
////		userList.add(new User());
//		list.add(new User());
//		int number = (int)list.get(0); // unboxing
//		
//		String i = (String)list.get(1);
		
//		var list = new Generics<Integer>();
//		list.add(1);
//		int number = list.get(0);
//		
//		var userList = new Generics<User>();
//		userList.add(new User());
//		User user = userList.get(0);
		
//		var user1 = new User(30);
//		var user2 = new User(10);
//		
//		if (user1.compareTo(user2) < 0)
//			System.out.println("user1 < user2");
//		else if (user1.compareTo(user2) == 0)
//			System.out.println("user1 == user2");
//		else
//			System.out.println("user1 > user2");
//		
//		System.out.println("--------------------");
//		
//		var max = Utils.max(10, 50);
//		
//		var first = new User(1);
//		System.out.println(first);
//		var second = new User(5);
//		System.out.println(second);
//		var maxNumber = Utils.max(first, second);
//		System.out.println(maxNumber);
//		
//		System.out.println("--------------------");
//		
//		Utils.print("first", 10, "test");
//		
//		var kvp = new KeyValuePair<String, String>("key123", "value456");
//		System.out.println(kvp);
//		
//		Utils.printUser(new User(10));
//		Utils.printUser(new Instructor(20));
//		
//		Utils.printUser(new Generics<User>());
//		Utils.printUser(new Generics<Instructor>());
		
		var list = new Generics<String>();
		list.add("ABC");
		list.add("abc");
		for (var item : list) {
			System.out.println(item);
		}
		
		var iterator = list.iterator();
		
		while (iterator.hasNext()) {
			var current = iterator.next();
			System.out.println(current);
		}
	}
}
