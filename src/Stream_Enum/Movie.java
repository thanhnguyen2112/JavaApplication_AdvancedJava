package Stream_Enum;

public class Movie implements Comparable<Movie> {

		private String title;
		private int likes;
		private Genre genre;
		
		public Movie(String title, int likes, Genre genre) {
			super();
			this.title = title;
			this.likes = likes;
			this.genre = genre;
		}

		public int getLikes() {
			return likes;
		}

		public String getTitle() {
			return title;
		}

		public Genre getGenre() {
			return genre;
		}

		@Override
		public int compareTo(Movie o) {
			// TODO Auto-generated method stub
			return this.getTitle().compareTo(o.getTitle());
		}
		
		
	}

