package edu.knoldus;

class Movie {
  private String name;
  private int releaseYear;
  private int rating;
  private String genre;

  public Movie(String name, int releaseYear, int rating, String genre) {
    this.name = name;
    this.releaseYear = releaseYear;
    this.rating = rating;
    this.genre = genre;
  }

  public String getName() {
    return this.name;
  }

  public int getReleaseYear() {
    return this.releaseYear;
  }

  public int getRating() {
    return this.rating;
  }

  public String getGenre() {
    return this.genre;
  }

  @Override
  public String toString() {
    return ("\nMovie: " + this.name
        + "\tYear: " + this.releaseYear
        + "\tRating: " + this.rating
        + "\tGenre: " + this.genre);
  }
}
