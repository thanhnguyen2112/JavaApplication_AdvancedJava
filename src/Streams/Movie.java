package Streams;

public class Movie {

	private String title;
	private int likes;
	
	public Movie(String title, int likes) {
		super();
		this.title = title;
		this.likes = likes;
	}

	public int getLikes() {
		return likes;
	}

	public String getTitle() {
		return title;
	}
	
	
}
