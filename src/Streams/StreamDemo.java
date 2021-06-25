package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

	public static void show() {
		
//		List<Movie> movies = List.of(
//				new Movie("a", 10),
//				new Movie("b", 20),
//				new Movie("c", 30)
//		); 
//		
//		// find movies likes > 10
//		// imperative programming
//		int count = 0;
//		for (var movie : movies) {
//			if (movie.getLikes() > 10) {
//				count++;
//			}
//		}
//		System.out.println(count); ->2
//		
//		//declarative
//		var countCount = movies.stream()
//				.filter(movie -> movie.getLikes() > 10)
//				.count();
//		System.out.println(countCount); ->2
		
//		// From collections
//		Collection<Integer> list = new ArrayList<>();
//		list.stream();
//		
//		// From arrays
//		int [] numbers = {1, 2, 3};
//		Arrays.stream(numbers)
//				.forEach(System.out::println);
//		
//		// From object
//		Stream.of(1, 2, 3, 4, "abc")
//				.forEach(obj -> System.out.println(obj));
//		
//		// infinite
//		var stream = Stream.generate(() -> Math.random());
////		stream.forEach(System.out::println); -> vong lap vo han
//		
//		//finite
//		stream
//			.limit(5)
//			.forEach(System.out::println); // ->random 5
//		
//		//
//		Stream.iterate(1, n -> n + 1)
//				.limit(5)
//				.forEach(System.out::println); // -> 1 2 3 4 5
//		
//		Stream.iterate('a', x -> (char)(x + 1))
//				.limit(26)
//				.forEach(System.out::println);
		
		var movies = List.of(
				new Movie("a", 10),
				new Movie("b", 20),
				new Movie("c", 30)
		);
		
		movies.forEach(movie -> System.out.println(movie.getTitle()));
		
		// map()
		movies.stream()
				.map(movie -> movie.getTitle())
				.forEach(System.out::println);
		
		//
		movies.stream()
				.mapToInt(movie -> movie.getLikes())
				.forEach(System.out::println);
		
		// flatMap()
		var streamStream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
		streamStream.forEach(System.out::println);
		
		var stream = Stream.of(List.of(1, 2, 3), Arrays.asList(4, 5, 6));
		stream.flatMap(list -> list.stream())
				.forEach(list -> System.out.println(list));
		
		// Intermediate: map(), filter()
		var filtered = movies.stream()
			.filter(movie -> movie.getLikes() > 10);
		// Terminal: forEach()
			filtered.forEach(list -> System.out.println(list.getLikes()));
			
		//
		Predicate<Movie> isPopular = list -> list.getLikes() > 10;
		filtered = movies.stream().filter(isPopular);
		filtered.forEach(list -> System.out.println(list.getTitle()));
		
		
		// source data is not affected
		System.out.println(movies);
		
		
		// limit()
		movies.stream()
			.limit(2)
			.forEach(list -> System.out.println(list.getTitle()));
		
		// skip()
		movies.stream()
			.skip(1)
			.forEach(list -> System.out.println(list.getLikes()));
		
		// 100 movies - 10 movies/page (pageSide = 10)
		// show 3rd page (page = 3)
		// skip (20) = skip ((page - 1) * pageSide)
		// limit(pageSide)
		
		movies.stream()
				.skip(20)
				.limit(10)
				.forEach(list -> System.out.println(list.getTitle()));
		
		// takeWhile()
		
		// dropWhile()
		
	}
}




















