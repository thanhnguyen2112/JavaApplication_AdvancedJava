package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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
		movies.stream()
				.takeWhile(list -> list.getLikes() < 30)
				.forEach(list -> System.out.println(list.getTitle())); // <30 break
		
		// dropWhile()
		movies.stream()
				.dropWhile(list -> list.getLikes() < 30)
				.forEach(list -> System.out.println(list.getTitle())); // skip <30 ->
	}
	
	public static void shower() {
		var moviess = List.of(
				new Movie("b", 10),
				new Movie("a", 20),
				new Movie("c", 30),
				new Movie("b2", 10)
		);
		
		
		// sort
//		moviess.stream()
//				.sorted()
//				.forEach(list -> System.out.println(list.getTitle()));
		
//		moviess.stream()
//				.sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
//				.forEach(list -> System.out.println(list.getTitle()));
//		
//		//
//		moviess.stream()
//				.sorted(Comparator.comparing(Movie::getTitle).reversed())
//				.forEach(list -> System.out.println(list.getTitle())); // cba
//		
//		// all
//		moviess.stream()
//				.map(Movie::getLikes)
//				.forEach(System.out::println);
//		
//		// distinct()
//		moviess.stream()
//				.map(Movie::getLikes)
//				.distinct()
//				.forEach(System.out::println); // unique
//		
//		// 
//		moviess.stream()
//				.filter(list -> list.getLikes() > 10)
//				.map(Movie::getTitle)
//				.forEach(System.out::println);
//		
//		//
//		moviess.stream()
//				.filter(list -> list.getLikes() > 10)
//				.peek(list -> System.out.println("Filtered: " + list.getTitle()))
//				.map(Movie::getTitle)
//				.peek(list -> System.out.println("Maped: " + list))
//				.forEach(System.out::println);
//		
//		// count 
//		var count = moviess.stream()
//				.count();
//		System.out.println(count);
//		
//		// anyMath
//		boolean result = moviess.stream()
//				.anyMatch(list -> list.getLikes() > 20);
//		System.out.println(result);
//		
//		// allMath
//		result = moviess.stream()
//				.allMatch(list -> list.getLikes() > 20);
//		System.out.println(result);
//		
//		// noneMath
//		result = moviess.stream()
//				.noneMatch(list -> list.getLikes() > 20);
//		System.out.println(result);
//		
//		//
//		var result2 = moviess.stream()
//				.findFirst()
//				.get();
//		System.out.println(result2);
//		
//		//
//		System.out.println(moviess.stream()
//				.findAny()
//				.get());
//		
//		// max, min
//		System.out.println(moviess.stream()
//				.max(Comparator.comparing(Movie::getLikes))
//				.get());
//		
//		// 10 20 30 10
//		// 30 30 10
//		// 60 10
//		// 70
//		Optional<Integer> sum = moviess.stream()
//				.map(list -> list.getLikes())
////				.reduce((a, b) -> a + b);
////				.reduce((a,  b) -> Integer.sum(a, b));
//				.reduce(Integer::sum);
//		
//		System.out.println(sum.orElse(0));
//		
//		//
//		Integer sumSum = moviess.stream()
//				.map(list -> list.getLikes())
//				.reduce(0, Integer::sum);
//		System.out.println(sumSum);
		
		//
		List<Movie> list = moviess.stream()
				.filter(m -> m.getLikes() > 10)
				.collect(Collectors.toList());
		
		//
		Set<Movie> set = moviess.stream()
				.filter(m -> m.getLikes() > 10)
				.collect(Collectors.toSet());
		
		// map
		// key title
		// value likes
		Map<String, Integer> map = moviess.stream()
				.filter(m -> m.getLikes() > 10)
				.collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
		
		System.out.println(map);
		
		//
		Map<String, Movie> map2 = moviess.stream()
				.filter(m -> m.getLikes() > 10)
				.collect(Collectors.toMap(Movie::getTitle, Function.identity())); // m -> m
		
		System.out.println(map2);
		
		//
		var result1 = moviess.stream()
				.filter(m -> m.getLikes() > 10)
				.collect(Collectors.summingInt(Movie::getLikes));
		System.out.println(result1);
		
		//
		var result2 = moviess.stream()
				.filter(m -> m.getLikes() > 10)
				.collect(Collectors.summarizingInt(Movie::getLikes));
		System.out.println(result2);
		
		//
		var result3 = moviess.stream()
				.filter(m -> m.getLikes() > 10)
				.map(Movie::getTitle)
				.collect(Collectors.joining(" , "));
		System.out.println(result3);
	}
}




















