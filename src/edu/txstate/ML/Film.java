package edu.txstate.ML;


public class Film {

	
	private int filmID;
	private String title;
	private String releaseYear;
	private int length;
	private String rating;
	private String genre;
	private int ranking;


	public String getGenre() {
		return genre;
	}



	public void setGenre(String genre) {
		this.genre = genre;
	}



	public void setFilmID(int filmID) {
		this.filmID = filmID;
	}



	public Film(int filmID, String title, String genre, String releaseYear, int length, String rating, int ranking ) {
		super();
		this.filmID = filmID;
		this.title = title;
		this.genre = genre;
		this.releaseYear = releaseYear;
		this.length = length;
		this.rating = rating;
		this.ranking = ranking;
	}
	


	public int getRanking() {
		return ranking;
	}



	public void setRanking(int ranking) {
		this.ranking = ranking;
	}



	public int getFilmID() {
		return filmID;
	}

	public int getLength() {
		return length;
	}

	public String getRating() {
		return rating;
	}

	public String getReleaseYear() {
		return releaseYear;
	}

	public String getTitle() {
		return title;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Film [filmID=" + filmID + ", title=" + title
				 + ", releaseYear=" + releaseYear + ", length="
				+ length + ", rating=" + rating + "]";
	}
}
