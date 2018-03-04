package edu.knoldus;

import java.util.*;

public class Application {

  public static void main(String[] args) {
    // Ques 1
    ListOperation listObject = new ListOperation();
    ArrayList<Integer> list = new ArrayList<>();
    Random rand = new Random();
    for (int j = 0; j < 100; j++) {
      int num = rand.nextInt(100);
      list.add(num);
    }

    list.forEach(x -> {
      if(listObject.isPrime(x))
        System.out.println(x);
      else
        System.out.println("Not prime");
    });

    // Ques 2
    FileOperations fileObject = new FileOperations();
    String path = "/home/knoldus/javaassignment1/src/main/resources/content.txt";
    HashMap<String, Integer> frequencyOfWords = fileObject.countWords(path);
    System.out.println(frequencyOfWords);

    // Ques 3
    String str = "My name is Ayush Ayush is My name";
//    List<(String, Integer)> listt;


    // Ques 4
    List<Integer> list1 = Arrays.asList(1,2,3,4,5);
    List<Integer> list2 = Arrays.asList(5,4,3,2,1);
    List<Integer> product = listObject.getProductOfLists(list1, list2);
    System.out.println(product);

    // Ques 5
    MovieOperations movieObject = new MovieOperations();
    List<Movie> movieDb = Arrays.asList(
        (new Movie("Bahubali", 2012, 9, "Action")),
        (new Movie("Golmaal", 2006, 9, "Comedy")),
        (new Movie("Dhamaal", 2007, 8, "Comedy")),
        (new Movie("Awarapan", 2009, 7, "Romance")),
        (new Movie("Drishyam", 2015, 6, "Drama")),
        (new Movie("Interstellar", 2016, 7, "Sci-Fi"))
    );

    // Movie with genre Comedy and Rating greater than 8
    movieObject.movieWithGenreAndRating("Comedy", 8, movieDb)
        .forEach(System.out::println);

    // Movie with release year greater than 2000 and rating less than 8
    movieObject.movieWithReleaseYearAndRating(2000, 8, movieDb)
        .forEach(System.out::println);

    // Movie with even number ratings
    movieObject.movieWithEvenNumberRating(movieDb)
        .forEach(System.out::println);

    // Movie with rating 7 and genre Sci-Fi
    movieObject.movieWithRatingAndGenre("Sci-Fi", 7, movieDb)
        .forEach(System.out::println);
  }

}
