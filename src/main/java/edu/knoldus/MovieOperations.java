package edu.knoldus;

import java.util.List;
import java.util.stream.Collectors;

public class MovieOperations {

  public List<Movie> movieWithGenreAndRating(String genre, int rating, List<Movie> movieDb) {
    return (
        movieDb.stream()
            .filter(movie -> genre.equals(movie.getGenre()) && (rating < movie.getRating()))
            .collect(Collectors.toList())
    );
  }

  public List<Movie> movieWithReleaseYearAndRating(int releaseYear, int rating, List<Movie> movieDb) {
    return (
        movieDb.stream()
            .filter(movie -> releaseYear < movie.getReleaseYear() && rating > movie.getRating())
            .collect(Collectors.toList())
    );
  }

  public List<Movie> movieWithEvenNumberRating(List<Movie> movieDb) {
    return (
        movieDb.stream()
            .filter(movie -> movie.getRating() % 2 == 0)
            .collect(Collectors.toList())
    );
  }

  public List<Movie> movieWithRatingAndGenre(String genre, int rating, List<Movie> movieDb) {
    return (
        movieDb.stream()
            .filter(movie -> genre.equals(movie.getGenre()) && (rating == movie.getRating()))
            .collect(Collectors.toList())
    );
  }

}
