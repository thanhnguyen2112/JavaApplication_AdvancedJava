package Stream_Enum;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void showsh() {
		var movies = List.of(
				new Movie("a", 10, Genre.THRILLER),
				new Movie("b", 20, Genre.ACTION),
				new Movie("c", 30, Genre.ACTION)
		);
		
		//
//		Map<Genre, List<Movie>> 
		var result1 = movies.stream()
								.collect(Collectors.groupingBy(Movie::getGenre));
		System.out.println(result1);
		
		//
//		Map<Genre, Set<Movie>> 
		var result2 = movies.stream()
								.collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet()));
		System.out.println(result2);
		
		//
//		Map<Genre, Long> 
		var result3 = movies.stream()
								.collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
		System.out.println(result3);
		
		//
//		Map<Genre, String> 
		var result4 = movies.stream()
								.collect(Collectors.groupingBy(Movie::getGenre, 
								Collectors.mapping(Movie::getTitle, Collectors.joining(" , "))));
		System.out.println(result4);
		
		
		
		//
//		Map<Boolean, List<Movie>>
		var result5 = movies.stream()
				.collect(Collectors.partitioningBy(m -> m.getLikes() > 20));
		System.out.println(result5);
		
		//
		//Map<Boolean, String>
		var result6 = movies.stream()
				.collect(Collectors.partitioningBy(
						m -> m.getLikes() > 20, 
						Collectors.mapping(Movie::getTitle, Collectors.joining(" , "))));
		System.out.println(result6);
		
}
}
